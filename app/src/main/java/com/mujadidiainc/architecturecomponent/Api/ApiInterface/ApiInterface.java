package com.mujadidiainc.architecturecomponent.Api.ApiInterface;

import com.mujadidiainc.architecturecomponent.Wrapper.NamazRootBody;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("calendarByCity")
    Call<NamazRootBody> getNamazTiming(@Query("city") String city,@Query("country") String country,@Query("method") Integer method);

}
