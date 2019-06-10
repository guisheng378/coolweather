package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 陈佳星 on 2019/6/6.
 */

public class Basic {
    //注解建立JSON和Java字段间的映射关系
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
