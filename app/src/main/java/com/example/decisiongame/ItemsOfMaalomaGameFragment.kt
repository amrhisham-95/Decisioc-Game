package com.example.decisiongame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentItemsOfMaalomaGameBinding


class ItemsOfMaalomaGameFragment : Fragment() {

    private lateinit var binding : FragmentItemsOfMaalomaGameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment by using DataBinding
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_items_of_maaloma_game,container,false)

        // Using findNavController() to navigate From Items To Sports When Press the btnSportsGame
        binding.btnSportsGame.setOnClickListener {
            findNavController().navigate(R.id.action_itemsOfMaalomaGameFragment_to_sportsFragment)
        }

        // Using findNavController() to navigate From Items To Sciences When Press the btnSciencesGame
        binding.btnSciencesGame.setOnClickListener {
            findNavController().navigate(R.id.action_itemsOfMaalomaGameFragment_to_sciencesFragment)
        }

        // Using findNavController() to navigate From Items To History When Press the btnHistoryGame
        binding.btnHistoryGame.setOnClickListener {
            findNavController().navigate(R.id.action_itemsOfMaalomaGameFragment_to_historyFragment)
        }

        // Using findNavController() to navigate From Items To Geography When Press the btnGeographyGame
        binding.btnGeographyGame.setOnClickListener {
            findNavController().navigate(R.id.action_itemsOfMaalomaGameFragment_to_geographyFragment)
        }


        // Using findNavController() to navigate From ItemsScreen To MainScreen When Press the returnButton1
        binding.returnButton1.setOnClickListener {
            findNavController().navigate(R.id.action_itemsOfMaalomaGameFragment_to_mainFragment)
        }

        return binding.root
    }


}