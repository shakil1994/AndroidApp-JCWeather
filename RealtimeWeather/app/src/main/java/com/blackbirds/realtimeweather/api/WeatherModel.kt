package com.blackbirds.realtimeweather.api

data class WeatherModel(
    val current: Current,
    val location: Location
)