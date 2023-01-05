package com.example.decisiongame

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentSportsLevel1Binding

class SportsLevel1Fragment : Fragment() {

    private lateinit var binding : FragmentSportsLevel1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment by using DataBinding
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_sports_level1, container, false)

        // Using findNavController() to navigate From sportsLevel1 To itemsScreen
        binding.returnButtonLv1Sports.setOnClickListener {
            findNavController().navigate(R.id.action_sportsLevel1Fragment_to_itemsOfMaalomaGameFragment)
        }

        binding.goNextLv1Sports.setOnClickListener {
            if (binding.radioButton1Sports.isChecked && binding.radioButton4Sports.isChecked && binding.radioButton8Sports.isChecked) {
                findNavController().navigate(R.id.action_sportsLevel1Fragment_to_sportsLevel2Fragment)
            } else {
                binding.goNextLv1Sports.text = "TRY AGAIN"
                binding.goNextLv1Sports.setBackgroundColor(Color.RED)
            }
        }



            return binding.root
        }

    }