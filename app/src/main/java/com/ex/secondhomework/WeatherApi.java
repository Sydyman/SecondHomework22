package com.ex.secondhomework;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("weather")
    Call<WeatherResponse> getCurrentWeather(@Query("q") String city, @Query("appid") String apiKey);
}

