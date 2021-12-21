package com.example.theweatherapp.data.db.model.weather

import java.util.ArrayList

class Root {
    val coord: Coord? = null
    private val weather: List<Weather> = ArrayList<Weather>()
    val base: String? = null
    val main: Main? = null
    val visibility: Int? = null
    private val wind: Wind? = null
    val clouds: Clouds? = null
    val dt: Int? = null
    private val sys: Sys? = null
    val timezone: Int? = null
    val id: Int? = null
    val name: String? = null
    val cod: Int? = null

    fun getWeather(): List<Weather> {
        return weather
    }

    fun getWind(): Wind? {
        return wind
    }

    fun getSys(): Sys? {
        return sys
    }

    override fun toString(): String {
        return "Root{" +
                "coord=" + coord +
                ", weather=" + weather +
                ", base='" + base + '\'' +
                ", main=" + main +
                ", visibility=" + visibility +
                ", wind=" + wind +
                ", clouds=" + clouds +
                ", dt=" + dt +
                ", sys=" + sys +
                ", timezone=" + timezone +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                '}'
    }
}