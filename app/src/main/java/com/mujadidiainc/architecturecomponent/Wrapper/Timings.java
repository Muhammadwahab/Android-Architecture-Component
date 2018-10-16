
package com.mujadidiainc.architecturecomponent.Wrapper;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Timings {

    @SerializedName("Asr")
    private String mAsr;
    @SerializedName("Dhuhr")
    private String mDhuhr;
    @SerializedName("Fajr")
    private String mFajr;
    @SerializedName("Imsak")
    private String mImsak;
    @SerializedName("Isha")
    private String mIsha;
    @SerializedName("Maghrib")
    private String mMaghrib;
    @SerializedName("Midnight")
    private String mMidnight;
    @SerializedName("Sunrise")
    private String mSunrise;
    @SerializedName("Sunset")
    private String mSunset;

    public String getAsr() {
        return mAsr;
    }

    public void setAsr(String asr) {
        mAsr = asr;
    }

    public String getDhuhr() {
        return mDhuhr;
    }

    public void setDhuhr(String dhuhr) {
        mDhuhr = dhuhr;
    }

    public String getFajr() {
        return mFajr;
    }

    public void setFajr(String fajr) {
        mFajr = fajr;
    }

    public String getImsak() {
        return mImsak;
    }

    public void setImsak(String imsak) {
        mImsak = imsak;
    }

    public String getIsha() {
        return mIsha;
    }

    public void setIsha(String isha) {
        mIsha = isha;
    }

    public String getMaghrib() {
        return mMaghrib;
    }

    public void setMaghrib(String maghrib) {
        mMaghrib = maghrib;
    }

    public String getMidnight() {
        return mMidnight;
    }

    public void setMidnight(String midnight) {
        mMidnight = midnight;
    }

    public String getSunrise() {
        return mSunrise;
    }

    public void setSunrise(String sunrise) {
        mSunrise = sunrise;
    }

    public String getSunset() {
        return mSunset;
    }

    public void setSunset(String sunset) {
        mSunset = sunset;
    }

}
