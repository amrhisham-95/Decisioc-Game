package com.example.decisiongame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentQwamolahzaBinding

class QwamolahzaFragment : Fragment() {

    private lateinit var binding : FragmentQwamolahzaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment by using DataBinding
        binding =DataBindingUtil.inflate(inflater,R.layout.fragment_qwamolahza,container,false)

        binding.startQwamolahzaL1.setOnClickListener {
            findNavController().navigate(R.id.action_qwamolahzaFragment_to_qwamolahzaLevel1Fragment)
        }

        binding.backQwamolahzaL1.setOnClickListener {
            findNavController().navigate(R.id.action_qwamolahzaFragment_to_molahzaFragment)
        }

        return binding.root
    }

}