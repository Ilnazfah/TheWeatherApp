package com.example.theweatherapp.data.storage

import android.content.Context
import com.example.theweatherapp.domain.models.City

private const val SHARED_PREFS_NAME = "shared_prefs_name"
private const val KEY_NAME = "cityName"

class SharedPrefCityStorage(context: Context) : CityStorage {
    private val sharedPreferences = context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)

    override fun add(name: String): Boolean {
        sharedPreferences.edit().putString(KEY_NAME, name).apply()
        return true
    }

    override fun get(): City {
        val name = sharedPreferences.getString(KEY_NAME, "") ?: ""
        return City(id = 123, name = name)
    }

    override fun getList() {
        TODO("Not yet implemented")
    }
}