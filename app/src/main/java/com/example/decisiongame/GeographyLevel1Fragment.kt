package com.example.decisiongame

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentGeographyLevel1Binding

class GeographyLevel1Fragment : Fragment() {
   private lateinit var binding: FragmentGeographyLevel1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_geography_level1,container,false)


        // Using findNavController() to navigate From geographyLevel1Fragment To itemsScreen
        binding.returnButtonLv1Geography.setOnClickListener {
            findNavController().navigate(R.id.action_geographyLevel1Fragment_to_itemsOfMaalomaGameFragment)
        }


        binding.goNextLv1Geography.setOnClickListener {
            if (binding.radioButton1Lv1Geography.isChecked && binding.radioButton4Lv1Geography.isChecked && binding.radioButton8Lv1Geography.isChecked) {
                findNavController().navigate(R.id.action_geographyLevel1Fragment_to_geographyLevel2Fragment)
            } else {
                binding.goNextLv1Geography.text = "TRY AGAIN"
                binding.goNextLv1Geography.setBackgroundColor(Color.RED)
            }
        }


        return binding.root
    }


}