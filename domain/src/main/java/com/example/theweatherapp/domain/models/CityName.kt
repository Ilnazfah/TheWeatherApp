package com.example.theweatherapp.domain.models

class CityName(val id: Long, val name: String) {
    override fun toString(): String {
        return "CityName(id=$id, name='$name')"
    }
}