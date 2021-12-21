package com.example.theweatherapp.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cities")
class City(@PrimaryKey val id: String, val name: String) {
}