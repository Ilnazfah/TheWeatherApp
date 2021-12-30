package com.example.theweatherapp.data.storage

import android.content.Context
import android.util.Log
import com.example.theweatherapp.data.db.CityDao
import com.example.theweatherapp.data.entities.City

private const val SHARED_PREFS_NAME = "shared_prefs_name"
private const val KEY_NAME = "cityName"

class SharedPrefCityStorage(context: Context) : CityStorage {
    private val sharedPreferences = context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)

    override fun add(city: City): Boolean {
        sharedPreferences.edit().putString(KEY_NAME, city.name).apply()
        Log.i("AAA", "SharedPrefCityStorage")
        return true
    }

    override fun get(name: String): City {
        val name = sharedPreferences.getString(KEY_NAME, "") ?: ""
        return City(name = name)
    }

    override fun getList(): List<City> {
        TODO("Not yet implemented")
    }
}