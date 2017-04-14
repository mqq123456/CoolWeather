package com.heqinuc.coolweather.gson;

/**
 * Created by heqin on 2017/4/13.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
