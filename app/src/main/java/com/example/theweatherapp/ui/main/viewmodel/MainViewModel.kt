package com.example.theweatherapp.ui.main.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
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

    fun addCity(name: String) {
        addCityUseCase.execute(name)
    }

    fun getCity(): String {
        return getCityUseCase.execute().name
    }

    fun getCityList(): List<String> {
        return getCityListUseCase.execute()
    }
}