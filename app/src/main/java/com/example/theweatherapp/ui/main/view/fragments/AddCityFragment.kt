package com.example.theweatherapp.ui.main.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Toast
import com.example.theweatherapp.R
import com.example.theweatherapp.databinding.FragmentAddCityBinding
import com.example.theweatherapp.ui.main.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.fragment_add_city.*

class AddCityFragment(private val vm: MainViewModel) : Fragment(R.layout.fragment_add_city) {
    val binding: FragmentAddCityBinding by lazy { FragmentAddCityBinding.inflate(requireActivity().layoutInflater) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding.addBtn.setOnClickListener ( View.OnClickListener {
            vm.addCity(add_city_field.text.toString())
            Toast.makeText(activity, "The city have been added!", Toast.LENGTH_LONG).show()
        })
        return binding.root
    }
}