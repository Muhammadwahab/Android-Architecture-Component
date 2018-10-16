
package com.mujadidiainc.architecturecomponent.Wrapper;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Method {

    @SerializedName("id")
    private Integer mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("params")
    private Params mParams;

    public Integer getId() {
        return mId;
    }

    public void setId(Integer id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Params getParams() {
        return mParams;
    }

    public void setParams(Params params) {
        mParams = params;
    }

}
