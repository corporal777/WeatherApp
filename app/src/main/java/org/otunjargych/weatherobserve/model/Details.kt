package org.otunjargych.weatherobserve.model

import com.google.gson.annotations.SerializedName

class Details(
    @SerializedName("temp")
    val temp: Double,
    @SerializedName("feels_like")
    val feels_like: Double,
    @SerializedName("temp_min")
    val temp_min: Double,
    @SerializedName("temp_max")
    val temp_max: Double,
    @SerializedName("pressure")
    val pressure: Int,
    @SerializedName("humidity")
    val humidity: Int


)