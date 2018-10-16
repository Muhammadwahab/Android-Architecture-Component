package com.mujadidiainc.architecturecomponent.Repositry;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.mujadidiainc.architecturecomponent.Api.ApiClient;
import com.mujadidiainc.architecturecomponent.Api.ApiInterface.ApiInterface;
import com.mujadidiainc.architecturecomponent.Wrapper.Datum;
import com.mujadidiainc.architecturecomponent.Wrapper.NamazRootBody;
import com.mujadidiainc.architecturecomponent.Wrapper.Timings;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NamazRepositry {


    private ApiInterface apiInterface;
    private String CITY="karachi";
    private String COUNTRY="pakistan";
    private int METHOD=2;

    public NamazRepositry() {
        apiInterface=ApiClient.getClient().create(ApiInterface.class);
    }

    public LiveData<List<Timings>> getTimings()
    {
        final MutableLiveData<List<Timings>> data = new MutableLiveData<>();
        apiInterface.getNamazTiming(CITY,COUNTRY,METHOD).enqueue(new Callback<NamazRootBody>() {
            @Override
            public void onResponse(Call<NamazRootBody> call, Response<NamazRootBody> response) {

                List<Timings> timingsList=new ArrayList<>();
                for (Datum datum :response.body().getData()) {

                    timingsList.add(datum.getTimings());
                }
                data.setValue(timingsList);
            }

            @Override
            public void onFailure(Call<NamazRootBody> call, Throwable t) {
                Log.e("Repositry", "onFailure: "+t.getMessage() );

            }
        });

        return data;
    }
}
