package com.example.decisiongame

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentQwamolahzaLevel1Binding



class QwamolahzaLevel1Fragment : Fragment() {

private lateinit var binding : FragmentQwamolahzaLevel1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_qwamolahza_level1,container,false)



        binding.goNextQMLv1.setOnClickListener {
            if (binding.radioButton2QMLv1.isChecked && binding.radioButton6QMLv1.isChecked) {
                findNavController().navigate(R.id.action_qwamolahzaLevel1Fragment_to_qwamolahza2Fragment)
            } else {
                binding.goNextQMLv1.text = "TRY AGAIN"
                binding.goNextQMLv1.setBackgroundColor(Color.RED)
            }
        }


        binding.returnButtonQMLv1.setOnClickListener {
            findNavController().navigate(R.id.action_qwamolahzaLevel1Fragment_to_molahzaFragment)
        }

        return binding.root
    }}


