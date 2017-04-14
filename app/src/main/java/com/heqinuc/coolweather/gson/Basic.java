package com.heqinuc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by heqin on 2017/4/13.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
