
package com.mujadidiainc.architecturecomponent.Wrapper;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@SuppressWarnings("unused")
public class NamazRootBody {

    @SerializedName("code")
    private Integer mCode;
    @SerializedName("data")
    private List<Datum> mData;
    @SerializedName("status")
    private String mStatus;

    public Integer getCode() {
        return mCode;
    }

    public void setCode(Integer code) {
        mCode = code;
    }

    public List<Datum> getData() {
        return mData;
    }

    public void setData(List<Datum> data) {
        mData = data;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

}
