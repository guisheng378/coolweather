package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 陈佳星 on 2019/6/6.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
