package com.example.theweatherapp.ui.main.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.theweatherapp.R
import com.example.theweatherapp.databinding.FragmentSearchBinding
import com.example.theweatherapp.domain.models.CityName
import com.example.theweatherapp.ui.main.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.fragment_search.*

class SearchFragment(private val vm: MainViewModel) : Fragment(R.layout.fragment_search) {
    val binding: FragmentSearchBinding by lazy { FragmentSearchBinding.inflate(requireActivity().layoutInflater) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding.findButton.setOnClickListener ( View.OnClickListener {
            val city = searchCityField.text.toString()
            resultTextView.setText(vm.getCity(city).toString())
        })
        return binding.root
    }
}