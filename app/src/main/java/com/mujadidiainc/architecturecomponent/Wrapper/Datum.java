
package com.mujadidiainc.architecturecomponent.Wrapper;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Datum {

    @SerializedName("date")
    private Date mDate;
    @SerializedName("meta")
    private Meta mMeta;
    @SerializedName("timings")
    private Timings mTimings;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public Meta getMeta() {
        return mMeta;
    }

    public void setMeta(Meta meta) {
        mMeta = meta;
    }

    public Timings getTimings() {
        return mTimings;
    }

    public void setTimings(Timings timings) {
        mTimings = timings;
    }

}
