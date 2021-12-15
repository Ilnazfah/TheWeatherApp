package com.example.theweatherapp.data.storage

import com.example.theweatherapp.domain.models.City

interface CityStorage {
    fun add(name: String): Boolean
    fun get(): City
    fun getList()
}