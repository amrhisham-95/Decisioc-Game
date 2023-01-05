package com.example.decisiongame

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentQwamolahza2Level2Binding
import com.example.decisiongame.databinding.FragmentQwamolahza3Level3Binding


class Qwamolahza3Level3Fragment : Fragment() {
    private lateinit var binding : FragmentQwamolahza3Level3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment by using DataBinding
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_qwamolahza3_level3, container, false)



        binding.goNextQMLv3.setOnClickListener {
            if (binding.radioButton3QMLv3.isChecked && binding.radioButton6QMLv3.isChecked) {
                findNavController().navigate(R.id.action_qwamolahza3Level3Fragment_to_congratulationQwamolahzaGameFragment)
            } else {
                binding.goNextQMLv3.text = "TRY AGAIN"
                binding.goNextQMLv3.setBackgroundColor(Color.RED)
            }
        }

        binding.returnButtonQMLv3.setOnClickListener {
            findNavController().navigate(R.id.action_qwamolahza3Level3Fragment_to_qwamolahza3Fragment)
        }

        return binding.root
    }

}