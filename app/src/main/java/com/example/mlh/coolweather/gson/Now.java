package com.example.mlh.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MLH on 2017/2/21.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info ;
    }
}
