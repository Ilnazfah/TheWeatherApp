package com.example.theweatherapp.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.theweatherapp.data.entities.City

@Database(entities = [City::class], version = 1, exportSchema = false)
abstract class CitiesDataBase : RoomDatabase() {
    abstract fun cityDao(): CityDao

    companion object {
        private var INSTANCE: CitiesDataBase? = null

        fun getInstance(context: Context): CitiesDataBase? {
            if (INSTANCE == null) {
                synchronized(CitiesDataBase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                    CitiesDataBase::class.java, "cities.db").allowMainThreadQueries().build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}