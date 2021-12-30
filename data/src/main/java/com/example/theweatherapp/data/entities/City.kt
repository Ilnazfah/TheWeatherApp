package com.example.theweatherapp.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cities")
class City(val name: String) {
    @PrimaryKey(autoGenerate = true) var id: Long = 0
}