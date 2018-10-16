
package com.mujadidiainc.architecturecomponent.Wrapper;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Month {

    @SerializedName("ar")
    private String mAr;
    @SerializedName("en")
    private String mEn;
    @SerializedName("number")
    private Integer mNumber;

    public String getAr() {
        return mAr;
    }

    public void setAr(String ar) {
        mAr = ar;
    }

    public String getEn() {
        return mEn;
    }

    public void setEn(String en) {
        mEn = en;
    }

    public Integer getNumber() {
        return mNumber;
    }

    public void setNumber(Integer number) {
        mNumber = number;
    }

}
