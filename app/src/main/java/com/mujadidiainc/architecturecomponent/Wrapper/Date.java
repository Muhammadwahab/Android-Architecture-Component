
package com.mujadidiainc.architecturecomponent.Wrapper;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Date {

    @SerializedName("gregorian")
    private Gregorian mGregorian;
    @SerializedName("hijri")
    private Hijri mHijri;
    @SerializedName("readable")
    private String mReadable;
    @SerializedName("timestamp")
    private String mTimestamp;

    public Gregorian getGregorian() {
        return mGregorian;
    }

    public void setGregorian(Gregorian gregorian) {
        mGregorian = gregorian;
    }

    public Hijri getHijri() {
        return mHijri;
    }

    public void setHijri(Hijri hijri) {
        mHijri = hijri;
    }

    public String getReadable() {
        return mReadable;
    }

    public void setReadable(String readable) {
        mReadable = readable;
    }

    public String getTimestamp() {
        return mTimestamp;
    }

    public void setTimestamp(String timestamp) {
        mTimestamp = timestamp;
    }

}
