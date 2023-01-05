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

class HistoryLevel3Fragment : Fragment() {

    private lateinit var binding : FragmentHistoryLevel3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_history_level3,container,false)

        // Using findNavController() to navigate From sciencesLevel1Fragment To itemsScreen
        binding.returnButtonLv3History.setOnClickListener {
            findNavController().navigate(R.id.action_historyLevel3Fragment_to_historyLevel2Fragmentt)
        }

        binding.goNextLv3History.setOnClickListener {
            if (binding.radioButton2Lv3History.isChecked && binding.radioButton4Lv3History.isChecked && binding.radioButton9Lv3History.isChecked) {
                findNavController().navigate(R.id.action_historyLevel3Fragment_to_congratulationMaalomaGameFragment)
            } else {
                binding.goNextLv3History.text = "TRY AGAIN"
                binding.goNextLv3History.setBackgroundColor(Color.RED)
            }
        }


        return binding.root
    }


}