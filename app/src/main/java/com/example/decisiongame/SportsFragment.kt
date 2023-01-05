package com.example.decisiongame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentSportsBinding

class SportsFragment : Fragment() {

    private lateinit var binding : FragmentSportsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment by using DataBinding
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_sports,container,false)


        // Using findNavController() to navigate From Sports To sportsLevel1 When Press the startSportsL1
        binding.startSportsL1.setOnClickListener {
            findNavController().navigate(R.id.action_sportsFragment_to_sportsLevel1Fragment)
        }

        // Using findNavController() to navigate From Sports To Items When Press the backSportsL1
        binding.backSportsL1.setOnClickListener {
            findNavController().navigate(R.id.action_sportsFragment_to_itemsOfMaalomaGameFragment)
        }

        return binding.root
    }



}