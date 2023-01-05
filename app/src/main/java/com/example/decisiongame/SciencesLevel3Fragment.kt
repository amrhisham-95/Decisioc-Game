package com.example.decisiongame

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentHistoryLevel3Binding
import com.example.decisiongame.databinding.FragmentSciencesLevel3Binding


class SciencesLevel3Fragment : Fragment() {
    private lateinit var binding : FragmentSciencesLevel3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_sciences_level3,container,false)

        // Using findNavController() to navigate From sciencesLevel1Fragment To itemsScreen
        binding.returnButtonLv3Sciences.setOnClickListener {
            findNavController().navigate(R.id.action_sciencesLevel3Fragment_to_sciencesLevel2Fragment)
        }

        binding.goNextLv3Sciences.setOnClickListener {
            if (binding.radioButton2Lv3Sciences.isChecked && binding.radioButton4Lv3Sciences.isChecked && binding.radioButton8Lv3Sciences.isChecked) {
                findNavController().navigate(R.id.action_sciencesLevel3Fragment_to_congratulationMaalomaGameFragment)
            } else {
                binding.goNextLv3Sciences.text = "TRY AGAIN"
                binding.goNextLv3Sciences.setBackgroundColor(Color.RED)
            }
        }

        return binding.root
    }


}