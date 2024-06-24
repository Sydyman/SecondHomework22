package com.ex.secondhomework;

import com.google.gson.annotations.SerializedName;

public class WeatherResponse {
    @SerializedName("main")
    public Main main;

    public class Main {
        @SerializedName("temp")
        public float temp;
    }
}

