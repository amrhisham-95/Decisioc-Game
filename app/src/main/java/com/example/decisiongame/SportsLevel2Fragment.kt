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


class SportsLevel2Fragment : Fragment() {

    private lateinit var binding : FragmentSportsLevel2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment by using DataBinding
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_sports_level2,container,false)

        // Using findNavController() to navigate
        binding.returnButtonLv2Sports.setOnClickListener {
            findNavController().navigate(R.id.action_sportsLevel2Fragment_to_sportsLevel1Fragment)
        }


        binding.goNextLv2Sports.setOnClickListener {
            if (binding.radioButton3lv2Sports.isChecked && binding.radioButton4lv2Sports.isChecked && binding.radioButton8lv2Sports.isChecked) {
                findNavController().navigate(R.id.action_sportsLevel2Fragment_to_sportsLevel3Fragment)
            } else {
                binding.goNextLv2Sports.text = "TRY AGAIN"
                binding.goNextLv2Sports.setBackgroundColor(Color.RED)
            }
        }

        return binding.root
    }

}