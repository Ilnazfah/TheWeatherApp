package com.example.theweatherapp.domain.usecases

import com.example.theweatherapp.domain.models.CityName
import com.example.theweatherapp.domain.repository.CityRepository

class GetCityUseCase(private val cityRepository: CityRepository) {
    fun execute(name: String): CityName {
        return cityRepository.getCity(name)
    }
}