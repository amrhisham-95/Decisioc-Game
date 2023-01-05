package com.example.decisiongame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentQwamolahza2Binding
import com.example.decisiongame.databinding.FragmentQwamolahzaBinding

class Qwamolahza2Fragment : Fragment() {

    private lateinit var binding : FragmentQwamolahza2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment by using DataBinding
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_qwamolahza2, container, false)


        binding.startQwamolahzaL2.setOnClickListener {
            findNavController().navigate(R.id.action_qwamolahza2Fragment_to_qwamolahza2Level2Fragment)
        }

        binding.backQwamolahzaL2.setOnClickListener {
            findNavController().navigate(R.id.action_qwamolahza2Fragment_to_molahzaFragment)
        }

        return binding.root

    }
}