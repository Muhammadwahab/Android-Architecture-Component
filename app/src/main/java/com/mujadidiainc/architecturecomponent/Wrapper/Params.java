
package com.mujadidiainc.architecturecomponent.Wrapper;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Params {

    @SerializedName("Fajr")
    private Integer mFajr;
    @SerializedName("Isha")
    private Integer mIsha;

    public Integer getFajr() {
        return mFajr;
    }

    public void setFajr(Integer fajr) {
        mFajr = fajr;
    }

    public Integer getIsha() {
        return mIsha;
    }

    public void setIsha(Integer isha) {
        mIsha = isha;
    }

}
