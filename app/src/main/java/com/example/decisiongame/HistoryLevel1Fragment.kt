package com.example.decisiongame

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentHistoryLevel1Binding

class HistoryLevel1Fragment : Fragment() {
  private lateinit var binding : FragmentHistoryLevel1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_history_level1,container,false)

        binding.goNextLv1History.setOnClickListener {
            if (binding.radioButton1Lv1History.isChecked && binding.radioButton4Lv1History.isChecked && binding.radioButton7Lv1History.isChecked) {
                findNavController().navigate(R.id.action_historyLevel1Fragment_to_historyLevel2Fragmentt)
            } else {
                binding.goNextLv1History.text = "TRY AGAIN"
                binding.goNextLv1History.setBackgroundColor(Color.RED)
            }
        }

        // Using findNavController() to navigate From historyLevel1Fragment To itemsOfMaalomaGameFragment
        binding.returnButtonLv1History.setOnClickListener {
            findNavController().navigate(R.id.action_historyLevel1Fragment_to_itemsOfMaalomaGameFragment)
        }

        return binding.root
    }

}