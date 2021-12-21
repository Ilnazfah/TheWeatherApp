package com.example.theweatherapp.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.theweatherapp.R
import com.example.theweatherapp.ui.main.view.fragments.AddCityFragment
import com.example.theweatherapp.ui.main.view.fragments.GetCityListFragment
import com.example.theweatherapp.ui.main.view.fragments.SearchFragment
import com.example.theweatherapp.ui.main.viewmodel.MainViewModel
import com.example.theweatherapp.ui.main.viewmodel.MainViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_add_city.*

class MainActivity : AppCompatActivity() {
    private lateinit var vm: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        println(addCityUseCase.addCity("Some City"))
//        println(getCityUseCase.getCity())
        Log.e("AAA", "Activity created")

        vm = ViewModelProvider(this, MainViewModelFactory(this)).get(MainViewModel::class.java)

        search_btn.setOnClickListener {
            val searchFragment = SearchFragment(vm)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl_fragment, searchFragment)
                commit()
            }
        }

        add_city_btn.setOnClickListener {
            val addCityFragment = AddCityFragment(vm)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl_fragment, addCityFragment)
                commit()
            }
        }

        get_city_list_btn.setOnClickListener {
            val getCityListFragment = GetCityListFragment()
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl_fragment, getCityListFragment)
                commit()
            }
        }
    }
}