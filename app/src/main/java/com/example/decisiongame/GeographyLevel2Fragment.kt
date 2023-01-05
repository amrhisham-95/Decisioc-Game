package com.example.decisiongame

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentGoegraphyLevel2Binding

class GeographyLevel2Fragment : Fragment() {

    private lateinit var binding : FragmentGoegraphyLevel2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_goegraphy_level2,container,false)

        // Using findNavController() to navigate
        binding.returnButtonLv2Geography.setOnClickListener {
            findNavController().navigate(R.id.action_geographyLevel2Fragment_to_geographyLevel1Fragment)
        }


        // Using findNavController() to navigate

        binding.goNextLv2Geography.setOnClickListener {
            if (binding.radioButton1Lv2Geography.isChecked && binding.radioButton4Lv2Geography.isChecked && binding.radioButton8Lv2Geography.isChecked) {
                findNavController().navigate(R.id.action_geographyLevel2Fragment_to_geographyLevel3Fragment)
            } else {
                binding.goNextLv2Geography.text = "TRY AGAIN"
                binding.goNextLv2Geography.setBackgroundColor(Color.RED)
            }
        }


        return  binding.root
    }


}