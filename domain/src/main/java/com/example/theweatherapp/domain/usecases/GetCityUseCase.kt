package com.example.theweatherapp.domain.usecases

import com.example.theweatherapp.domain.models.CityName
import com.example.theweatherapp.domain.repository.CityRepository

class GetCityUseCase(private val cityRepository: CityRepository) {
    fun execute(): CityName {
        return cityRepository.getCity()
    }
}