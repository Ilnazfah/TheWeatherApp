package com.example.theweatherapp.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey

class CityName(val name: String) {
    var id: Long = 0
    override fun toString(): String {
        return "CityName(id=$id, name='$name')"
    }
}