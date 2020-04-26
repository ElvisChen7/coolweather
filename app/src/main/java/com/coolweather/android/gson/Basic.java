package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("lat")
    public String cityLat;

    @SerializedName("lon")
    public String cityLon;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }

}
