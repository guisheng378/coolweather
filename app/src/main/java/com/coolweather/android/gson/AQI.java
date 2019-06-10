package com.coolweather.android.gson;

/**
 * Created by 陈佳星 on 2019/6/6.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
