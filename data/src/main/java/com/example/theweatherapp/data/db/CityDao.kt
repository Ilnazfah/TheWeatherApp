package com.example.theweatherapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.theweatherapp.data.entities.City
import kotlinx.coroutines.flow.Flow

@Dao
interface CityDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addCity(city: City)

    @Query("SELECT * FROM cities")
    fun getCityList(): List<City>

    @Query("SELECT * FROM cities WHERE name = :name")
    fun getCity(name: String): City
}