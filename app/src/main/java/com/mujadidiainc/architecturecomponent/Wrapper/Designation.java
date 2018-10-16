
package com.mujadidiainc.architecturecomponent.Wrapper;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Designation {

    @SerializedName("abbreviated")
    private String mAbbreviated;
    @SerializedName("expanded")
    private String mExpanded;

    public String getAbbreviated() {
        return mAbbreviated;
    }

    public void setAbbreviated(String abbreviated) {
        mAbbreviated = abbreviated;
    }

    public String getExpanded() {
        return mExpanded;
    }

    public void setExpanded(String expanded) {
        mExpanded = expanded;
    }

}
