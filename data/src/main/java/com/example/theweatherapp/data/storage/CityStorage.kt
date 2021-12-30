package com.example.theweatherapp.data.storage

import com.example.theweatherapp.data.entities.City

interface CityStorage {
    fun add(city: City): Boolean
    fun get(name: String): City
    fun getList(): List<City>
}