package com.example.decisiongame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding : FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment by using DataBinding
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_main,container,false)

        // Using findNavController() to navigate From MainFragment To ItemsScreen When Press the buttonForMaalomaId
        binding.buttonForMaalomaId.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_itemsOfMaalomaGameFragment)
        }

        // Using findNavController() to navigate From MainFragment To ItemsScreen When Press the buttonForMolahazaId
        binding.buttonForMolahazaId.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_molahzaFragment)
        }
        return binding.root
    }

}