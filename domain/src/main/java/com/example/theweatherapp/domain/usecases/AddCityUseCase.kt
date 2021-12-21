package com.example.theweatherapp.domain.usecases

import com.example.theweatherapp.domain.repository.CityRepository


class AddCityUseCase(private val cityRepository: CityRepository) {
    fun execute(name: String) {
        cityRepository.addCity(name)
    }
}