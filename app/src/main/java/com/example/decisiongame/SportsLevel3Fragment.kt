package com.example.decisiongame

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentSportsLevel2Binding
import com.example.decisiongame.databinding.FragmentSportsLevel3Binding

class SportsLevel3Fragment : Fragment() {

    private lateinit var binding : FragmentSportsLevel3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment by using DataBinding
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_sports_level3,container,false)

        // Using findNavController() to navigate
        binding.returnButtonLv3Sports.setOnClickListener {
            findNavController().navigate(R.id.action_sportsLevel3Fragment_to_sportsLevel2Fragment)
        }

        binding.goNextLv3Sports.setOnClickListener {
            if (binding.radioButton2lv3Sports.isChecked && binding.radioButton6lv3Sports.isChecked && binding.radioButton8lv3Sports.isChecked) {
                findNavController().navigate(R.id.action_sportsLevel3Fragment_to_congratulationMaalomaGameFragment)
            } else {
                binding.goNextLv3Sports.text = "TRY AGAIN"
                binding.goNextLv3Sports.setBackgroundColor(Color.RED)
            }
        }


        return binding.root
}}