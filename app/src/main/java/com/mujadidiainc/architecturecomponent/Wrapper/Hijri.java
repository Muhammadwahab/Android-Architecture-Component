
package com.mujadidiainc.architecturecomponent.Wrapper;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@SuppressWarnings("unused")
public class Hijri {

    @SerializedName("date")
    private String mDate;
    @SerializedName("day")
    private String mDay;
    @SerializedName("designation")
    private Designation mDesignation;
    @SerializedName("format")
    private String mFormat;
    @SerializedName("holidays")
    private List<Object> mHolidays;
    @SerializedName("month")
    private Month mMonth;
    @SerializedName("weekday")
    private Weekday mWeekday;
    @SerializedName("year")
    private String mYear;

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getDay() {
        return mDay;
    }

    public void setDay(String day) {
        mDay = day;
    }

    public Designation getDesignation() {
        return mDesignation;
    }

    public void setDesignation(Designation designation) {
        mDesignation = designation;
    }

    public String getFormat() {
        return mFormat;
    }

    public void setFormat(String format) {
        mFormat = format;
    }

    public List<Object> getHolidays() {
        return mHolidays;
    }

    public void setHolidays(List<Object> holidays) {
        mHolidays = holidays;
    }

    public Month getMonth() {
        return mMonth;
    }

    public void setMonth(Month month) {
        mMonth = month;
    }

    public Weekday getWeekday() {
        return mWeekday;
    }

    public void setWeekday(Weekday weekday) {
        mWeekday = weekday;
    }

    public String getYear() {
        return mYear;
    }

    public void setYear(String year) {
        mYear = year;
    }

}
