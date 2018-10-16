package com.mujadidiainc.architecturecomponent.Api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {
    private static Retrofit retrofit = null;
    public static Retrofit getClient() {
        OkHttpClient.Builder client = new OkHttpClient.Builder();
        client.readTimeout(180, TimeUnit.SECONDS);
        client.connectTimeout(180, TimeUnit.SECONDS);


        final TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    @Override
                    public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                    }

                    @Override
                    public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {

                    }

                    @Override
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return new java.security.cert.X509Certificate[]{};
                    }
                }
        };

        // Install the all-trusting trust manager



        KeyStore keyStore = null;
        try {
            keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }
        try {
            keyStore.load(null, null);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (CertificateException e) {
            e.printStackTrace();
        }

        SSLContext sslContext = null;
        try {
            sslContext = SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        TrustManagerFactory trustManagerFactory = null;
        try {
            trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        try {
            trustManagerFactory.init(keyStore);
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }
        KeyManagerFactory keyManagerFactory = null;
        try {
            keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        try {
            keyManagerFactory.init(keyStore, "keystore_pass".toCharArray());
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnrecoverableKeyException e) {
            e.printStackTrace();
        }
        try {
            sslContext.init(null, trustAllCerts, new SecureRandom());
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        client.sslSocketFactory(sslContext.getSocketFactory())
                .hostnameVerifier(new HostnameVerifier() {
                    @Override
                    public boolean verify(String hostname, SSLSession session) {
                        return true;
                    }
                });



        if (retrofit == null) {
            Gson gson = new GsonBuilder().setLenient().create();

             retrofit = new Retrofit.Builder()
                    .baseUrl("http://api.aladhan.com/v1/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(client.build())
                    .build();
        }
        return retrofit;
    }
}