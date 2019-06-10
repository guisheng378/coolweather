package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 陈佳星 on 2019/6/6.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    public class Comfort {

        @SerializedName("txt")
        public String info;
    }

    @SerializedName("cw")
    public CarWash carwash;

    public class CarWash {

        @SerializedName("txt")
        public String info;
    }

    public Sport sport;
    public class Sport {

        @SerializedName("txt")
        public String info;
    }
}
