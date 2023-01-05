package com.example.decisiongame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentGeographyBinding


class GeographyFragment : Fragment() {

    private lateinit var binding : FragmentGeographyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment by using DataBinding
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_geography,container,false)

        // Using findNavController() to navigate From Geography To geographyLevel1Fragment
        binding.startGeographyL1.setOnClickListener {
            findNavController().navigate(R.id.action_geographyFragment_to_geographyLevel1Fragment)
        }

        // Using findNavController() to navigate From Geography To Items When Press the backGeographyL1
        binding.backGeographyL1.setOnClickListener {
            findNavController().navigate(R.id.action_geographyFragment_to_itemsOfMaalomaGameFragment)
        }

        return binding.root
    }

}