package com.example.theweatherapp.domain.usecases

import com.example.theweatherapp.domain.repository.CityRepository

class AddCityUseCase(private val cityRepository: CityRepository) {
    fun addCity(name: String) {
        cityRepository.addCity(name)
    }
}