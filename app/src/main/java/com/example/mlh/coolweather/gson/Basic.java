package com.example.mlh.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MLH on 2017/2/21.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
