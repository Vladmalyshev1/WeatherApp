package com.example.weatherapp.data.models

import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    val latitude: Double,
    val longitude: Double,
    val hourly: HourlyData,
    val city: String,
    val temperature: Int,
    val condition: String
)

data class HourlyData(
    @SerializedName("time") val time: List<String>,
    @SerializedName("temperature_2m") val temperature2m: List<Double>
)

