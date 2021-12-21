package com.example.theweatherapp.data.repository

import android.content.Context
import androidx.room.PrimaryKey
import com.example.theweatherapp.data.db.CitiesDataBase
import com.example.theweatherapp.data.db.CityDao
import com.example.theweatherapp.data.entities.City
import com.example.theweatherapp.data.storage.CityStorage
import com.example.theweatherapp.domain.models.CityName
import com.example.theweatherapp.domain.repository.CityRepository



class CityRepositoryImpl(private val cityStorage: CityStorage) : CityRepository {
    //private var db: CityDao = CitiesDataBase.getInstance(context = Context)?.cityDao()!! TODO


    override fun addCity(name: String): Boolean {
        var city = City("", name)
        cityStorage.add(name)
        return true
    }

    override fun getCity(): CityName {
        val city = cityStorage.get()
        return CityName(id = 1, name = city.name)
    }

    override fun getCityList(): List<String> {
        TODO("Not yet implemented")
    }//interactor
}