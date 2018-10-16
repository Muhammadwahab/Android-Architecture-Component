
package com.mujadidiainc.architecturecomponent.Wrapper;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Offset {

    @SerializedName("Asr")
    private Integer mAsr;
    @SerializedName("Dhuhr")
    private Integer mDhuhr;
    @SerializedName("Fajr")
    private Integer mFajr;
    @SerializedName("Imsak")
    private Integer mImsak;
    @SerializedName("Isha")
    private Integer mIsha;
    @SerializedName("Maghrib")
    private Integer mMaghrib;
    @SerializedName("Midnight")
    private Integer mMidnight;
    @SerializedName("Sunrise")
    private Integer mSunrise;
    @SerializedName("Sunset")
    private Integer mSunset;

    public Integer getAsr() {
        return mAsr;
    }

    public void setAsr(Integer asr) {
        mAsr = asr;
    }

    public Integer getDhuhr() {
        return mDhuhr;
    }

    public void setDhuhr(Integer dhuhr) {
        mDhuhr = dhuhr;
    }

    public Integer getFajr() {
        return mFajr;
    }

    public void setFajr(Integer fajr) {
        mFajr = fajr;
    }

    public Integer getImsak() {
        return mImsak;
    }

    public void setImsak(Integer imsak) {
        mImsak = imsak;
    }

    public Integer getIsha() {
        return mIsha;
    }

    public void setIsha(Integer isha) {
        mIsha = isha;
    }

    public Integer getMaghrib() {
        return mMaghrib;
    }

    public void setMaghrib(Integer maghrib) {
        mMaghrib = maghrib;
    }

    public Integer getMidnight() {
        return mMidnight;
    }

    public void setMidnight(Integer midnight) {
        mMidnight = midnight;
    }

    public Integer getSunrise() {
        return mSunrise;
    }

    public void setSunrise(Integer sunrise) {
        mSunrise = sunrise;
    }

    public Integer getSunset() {
        return mSunset;
    }

    public void setSunset(Integer sunset) {
        mSunset = sunset;
    }

}
