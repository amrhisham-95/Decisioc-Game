package com.example.decisiongame

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentSciencesLevel1Binding

class SciencesLevel1Fragment : Fragment() {

    private lateinit var binding : FragmentSciencesLevel1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding =DataBindingUtil.inflate(inflater,R.layout.fragment_sciences_level1,container,false)

        // Using findNavController() to navigate From sciencesLevel1Fragment To itemsScreen
        binding.returnButtonLv1Sciences.setOnClickListener {
            findNavController().navigate(R.id.action_sciencesLevel1Fragment_to_itemsOfMaalomaGameFragment)
        }

        // Using findNavController() to navigate From sciencesLevel1Fragment To congratulation

        binding.goNextLv1Sciences.setOnClickListener {
            if (binding.radioButton2Lv1Sciences.isChecked && binding.radioButton4Lv1Sciences.isChecked && binding.radioButton7Lv1Sciences.isChecked) {
                findNavController().navigate(R.id.action_sciencesLevel1Fragment_to_sciencesLevel2Fragment)
            } else {
                binding.goNextLv1Sciences.text = "TRY AGAIN"
                binding.goNextLv1Sciences.setBackgroundColor(Color.RED)
            }
        }


        return binding.root
    }

}