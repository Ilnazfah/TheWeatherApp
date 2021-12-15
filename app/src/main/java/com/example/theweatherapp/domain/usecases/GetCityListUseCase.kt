package com.example.theweatherapp.domain.usecases

import com.example.theweatherapp.domain.repository.CityRepository

class GetCityListUseCase(private val cityRepository: CityRepository) {
    fun getCityList(): List<String> {
        return cityRepository.getCityList()
    }
}