package com.example.theweatherapp.ui.main.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.theweatherapp.domain.models.CityName
import com.example.theweatherapp.domain.usecases.AddCityUseCase
import com.example.theweatherapp.domain.usecases.GetCityListUseCase
import com.example.theweatherapp.domain.usecases.GetCityUseCase

class MainViewModel(private val addCityUseCase: AddCityUseCase,
                    private val getCityUseCase: GetCityUseCase,
                    private val getCityListUseCase: GetCityListUseCase
) : ViewModel() {


    init {
        Log.e("AAA", "VM created")
    }

    override fun onCleared() {
        Log.e("AAA", "VM cleared")
        super.onCleared()
    }

    fun addCity(cityName: CityName) {
        addCityUseCase.execute(cityName)
    }

    fun getCity(name: String): CityName {
        return getCityUseCase.execute(name)
    }

    fun getCityList(): List<CityName> {
        return getCityListUseCase.execute()
    }
}