package com.example.decisiongame

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentGeographyLevel3Binding
import com.example.decisiongame.databinding.FragmentHistoryLevel3Binding


class GeographyLevel3Fragment : Fragment() {

    private lateinit var binding : FragmentGeographyLevel3Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_geography_level3,container,false)

        // Using findNavController() to navigate From geographyLevel1Fragment To itemsScreen
        binding.returnButtonLv3Geography.setOnClickListener {
            findNavController().navigate(R.id.action_geographyLevel3Fragment_to_geographyLevel2Fragment)
        }

        binding.goNextLv3Geography.setOnClickListener {
            if (binding.radioButton1Lv3Geography.isChecked && binding.radioButton4Lv3Geography.isChecked && binding.radioButton8Lv3Geography.isChecked) {
                findNavController().navigate(R.id.action_geographyLevel3Fragment_to_congratulationMaalomaGameFragment)
            } else {
                binding.goNextLv3Geography.text = "TRY AGAIN"
                binding.goNextLv3Geography.setBackgroundColor(Color.RED)
            }
        }


        return  binding.root
    }


}