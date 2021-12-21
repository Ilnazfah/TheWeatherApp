package com.example.theweatherapp.ui.main.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.theweatherapp.data.repository.CityRepositoryImpl
import com.example.theweatherapp.data.storage.SharedPrefCityStorage
import com.example.theweatherapp.domain.usecases.AddCityUseCase
import com.example.theweatherapp.domain.usecases.GetCityListUseCase
import com.example.theweatherapp.domain.usecases.GetCityUseCase

class MainViewModelFactory(context: Context) : ViewModelProvider.Factory {
        private val cityStorage by lazy(LazyThreadSafetyMode.NONE) {
        SharedPrefCityStorage(context)
    }
    private val cityRepository by lazy(LazyThreadSafetyMode.NONE) {
        CityRepositoryImpl(cityStorage)
    }
    private val addCityUseCase by lazy(LazyThreadSafetyMode.NONE) {
        AddCityUseCase(cityRepository = cityRepository)
    }
    private val getCityUseCase by lazy(LazyThreadSafetyMode.NONE) {
        GetCityUseCase(cityRepository = cityRepository)
    }
    private val getCityListUseCase by lazy(LazyThreadSafetyMode.NONE) {
        GetCityListUseCase(cityRepository = cityRepository)
    }

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(
            addCityUseCase = addCityUseCase,
        getCityUseCase = getCityUseCase,
        getCityListUseCase = getCityListUseCase) as T
    }
}