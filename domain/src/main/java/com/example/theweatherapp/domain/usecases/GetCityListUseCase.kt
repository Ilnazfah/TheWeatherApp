package com.example.theweatherapp.domain.usecases

import com.example.theweatherapp.domain.models.CityName
import com.example.theweatherapp.domain.repository.CityRepository

class GetCityListUseCase(private val cityRepository: CityRepository) {
    fun execute(): List<CityName> {
        return cityRepository.getCityList()
    }
}