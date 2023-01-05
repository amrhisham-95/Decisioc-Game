package com.example.decisiongame

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentQwamolahza2Binding
import com.example.decisiongame.databinding.FragmentQwamolahza2Level2Binding

class Qwamolahza2Level2Fragment : Fragment() {

    private lateinit var binding : FragmentQwamolahza2Level2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment by using DataBinding
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_qwamolahza2_level2, container, false)



        binding.goNextQMLv2.setOnClickListener {
            if (binding.radioButton1QMLv2.isChecked && binding.radioButton4QMLv2.isChecked) {
                findNavController().navigate(R.id.action_qwamolahza2Level2Fragment_to_qwamolahza3Fragment)
            } else {
                binding.goNextQMLv2.text = "TRY AGAIN"
                binding.goNextQMLv2.setBackgroundColor(Color.RED)
            }
        }

        binding.returnButtonQMLv2.setOnClickListener {
            findNavController().navigate(R.id.action_qwamolahza2Level2Fragment_to_qwamolahza2Fragment)
        }

        return binding.root
    }


}