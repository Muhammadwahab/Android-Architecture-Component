
package com.mujadidiainc.architecturecomponent.Wrapper;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Meta {

    @SerializedName("latitude")
    private Double mLatitude;
    @SerializedName("latitudeAdjustmentMethod")
    private String mLatitudeAdjustmentMethod;
    @SerializedName("longitude")
    private Double mLongitude;
    @SerializedName("method")
    private Method mMethod;
    @SerializedName("midnightMode")
    private String mMidnightMode;
    @SerializedName("offset")
    private Offset mOffset;
    @SerializedName("school")
    private String mSchool;
    @SerializedName("timezone")
    private String mTimezone;

    public Double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(Double latitude) {
        mLatitude = latitude;
    }

    public String getLatitudeAdjustmentMethod() {
        return mLatitudeAdjustmentMethod;
    }

    public void setLatitudeAdjustmentMethod(String latitudeAdjustmentMethod) {
        mLatitudeAdjustmentMethod = latitudeAdjustmentMethod;
    }

    public Double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(Double longitude) {
        mLongitude = longitude;
    }

    public Method getMethod() {
        return mMethod;
    }

    public void setMethod(Method method) {
        mMethod = method;
    }

    public String getMidnightMode() {
        return mMidnightMode;
    }

    public void setMidnightMode(String midnightMode) {
        mMidnightMode = midnightMode;
    }

    public Offset getOffset() {
        return mOffset;
    }

    public void setOffset(Offset offset) {
        mOffset = offset;
    }

    public String getSchool() {
        return mSchool;
    }

    public void setSchool(String school) {
        mSchool = school;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }

}
