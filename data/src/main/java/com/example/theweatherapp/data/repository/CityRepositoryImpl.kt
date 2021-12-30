package com.example.theweatherapp.data.repository

import com.example.theweatherapp.data.db.CityDao
import com.example.theweatherapp.data.entities.City
import com.example.theweatherapp.data.storage.CityStorage
import com.example.theweatherapp.domain.models.CityName
import com.example.theweatherapp.domain.repository.CityRepository

class CityRepositoryImpl(private val cityStorageSP: CityStorage, private val cityStorageDB: CityStorage) : CityRepository {

    override fun addCity(cityName: CityName): Boolean {
        val city = mapToStorage(cityName)
        cityStorageDB.add(city)
        return true
    }

    override fun getCity(name: String): CityName {
        val city = cityStorageDB.get(name)
        return mapToDomain(city)
    }

    override fun getCityList(): List<CityName> {
        val cities = cityStorageDB.getList()
        return mapToStorage(cities)
    }

    private fun mapToStorage(cityName: CityName): City {
        return City(name = cityName.name)
    }

    private fun mapToStorage(cities: List<City>): List<CityName> {
        val list: MutableList<CityName> = ArrayList()
        for (i in cities.indices) {
            val name = cities[i].name
            val cityName = CityName(name)
            list.add(cityName)
        }
        return list
    }

    private fun mapToDomain(city: City): CityName {
        return CityName(name = city.name)
    }
}