package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 陈佳星 on 2019/6/6.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    public class Temperature {
        public String max;
        public String min;
    }

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
