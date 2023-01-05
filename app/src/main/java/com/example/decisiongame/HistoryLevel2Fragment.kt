package com.example.decisiongame

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentHistoryLevel2Binding

class HistoryLevel2Fragment : Fragment() {
   private lateinit var binding : FragmentHistoryLevel2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment by using DataBinding
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_history_level2,container,false)

        binding.goNextLv2History.setOnClickListener {
            if (binding.radioButton1Lv2History.isChecked && binding.radioButton6Lv2History.isChecked && binding.radioButton7Lv2History.isChecked) {
                findNavController().navigate(R.id.action_historyLevel2Fragmentt_to_historyLevel3Fragment)
            } else {
                binding.goNextLv2History.text = "TRY AGAIN"
                binding.goNextLv2History.setBackgroundColor(Color.RED)
            }
        }

        // Using findNavController() to navigate From historyLevel1Fragment To itemsOfMaalomaGameFragment
        binding.returnButtonLv2History.setOnClickListener {
            findNavController().navigate(R.id.action_historyLevel2Fragmentt_to_historyLevel1Fragment)
        }

        return binding.root
    }

}