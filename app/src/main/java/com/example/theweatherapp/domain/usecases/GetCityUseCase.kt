package com.example.theweatherapp.domain.usecases

import com.example.theweatherapp.domain.models.City
import com.example.theweatherapp.domain.repository.CityRepository

class GetCityUseCase(private val cityRepository: CityRepository) {
    fun getCity(): City {
        return cityRepository.getCity()
    }
}