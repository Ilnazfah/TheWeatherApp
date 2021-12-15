package com.example.theweatherapp.data.repository

import com.example.theweatherapp.data.storage.CityStorage
import com.example.theweatherapp.domain.models.City
import com.example.theweatherapp.domain.repository.CityRepository



class CityRepositoryImpl(private val cityStorage: CityStorage) : CityRepository {


    override fun addCity(name: String): Boolean {
        cityStorage.add(name)
        return true
    }

    override fun getCity(): City {
        return cityStorage.get()
    }

    override fun getCityList(): List<String> {
        TODO("Not yet implemented")
    }
}