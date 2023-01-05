package com.example.decisiongame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentCongratulationMaalomaGameBinding

class CongratulationMaalomaGameFragment : Fragment() {

    private lateinit var binding : FragmentCongratulationMaalomaGameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_congratulation_maaloma_game,container,false)

        // Using findNavController() to navigate
        binding.buttonMaalomaPlayAgain.setOnClickListener {
            findNavController().navigate(R.id.action_congratulationMaalomaGameFragment_to_itemsOfMaalomaGameFragment)
        }

        return binding.root
    }

}