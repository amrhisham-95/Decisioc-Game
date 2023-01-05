package com.example.decisiongame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentQwamolahza2Level2Binding
import com.example.decisiongame.databinding.FragmentQwamolahza3Binding

class Qwamolahza3Fragment : Fragment() {
    private lateinit var binding : FragmentQwamolahza3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment by using DataBinding
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_qwamolahza3, container, false)

        binding.startQwamolahzaL3.setOnClickListener {
            findNavController().navigate(R.id.action_qwamolahza3Fragment_to_qwamolahza3Level3Fragment)
        }

        binding.backQwamolahzaL3.setOnClickListener {
            findNavController().navigate(R.id.action_qwamolahza3Fragment_to_molahzaFragment)
        }
        return binding.root
    }

}