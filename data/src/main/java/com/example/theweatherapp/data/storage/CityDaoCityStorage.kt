package com.example.theweatherapp.data.storage

import android.content.Context
import android.util.Log
import com.example.theweatherapp.data.db.CitiesDataBase
import com.example.theweatherapp.data.db.CityDao
import com.example.theweatherapp.data.entities.City


class CityDaoCityStorage(context: Context) : CityStorage {
    private var db: CityDao = CitiesDataBase.getInstance(context = context)?.cityDao()!!

    override fun add(city: City): Boolean {
        db.addCity(city)
        return true
    }

    override fun get(name: String): City {
        return db.getCity(name)
    }

    override fun getList(): List<City> {
        return db.getCityList()
    }
}