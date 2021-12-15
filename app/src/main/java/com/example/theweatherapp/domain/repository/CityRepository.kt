package com.example.theweatherapp.domain.repository

import com.example.theweatherapp.domain.models.City

interface CityRepository {
    fun addCity(name: String): Boolean
    fun getCityList(): List<String>
    fun getCity(): City
}