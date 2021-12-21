package com.example.theweatherapp.data.storage

import com.example.theweatherapp.data.entities.City

interface CityStorage {
    fun add(name: String): Boolean
    fun get(): City
    fun getList()
}