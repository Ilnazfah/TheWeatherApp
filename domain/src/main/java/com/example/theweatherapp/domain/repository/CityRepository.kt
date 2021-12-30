package com.example.theweatherapp.domain.repository

import com.example.theweatherapp.domain.models.CityName

interface CityRepository {
    fun addCity(cityName: CityName): Boolean
    fun getCityList(): List<CityName>
    fun getCity(name: String): CityName
}