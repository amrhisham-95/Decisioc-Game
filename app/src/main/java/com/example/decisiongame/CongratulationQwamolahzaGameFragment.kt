package com.example.decisiongame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentCongratulationQwamolahzaGameBinding

class CongratulationQwamolahzaGameFragment : Fragment() {

    private lateinit var binding : FragmentCongratulationQwamolahzaGameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_congratulation_qwamolahza_game,container,false)

        // Using findNavController() to navigate
        binding.buttonQwaPlayAgain.setOnClickListener {
            findNavController().navigate(R.id.action_congratulationQwamolahzaGameFragment_to_molahzaFragment)
        }

        return binding.root
    }

}