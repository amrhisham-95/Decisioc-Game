package com.example.decisiongame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentItemsOfMaalomaGameBinding
import com.example.decisiongame.databinding.FragmentMolahzaBinding

class MolahzaFragment : Fragment() {

    private lateinit var binding: FragmentMolahzaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment by using DataBinding
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_molahza,container,false)


        // Using findNavController() to navigate From Sports To Items When Press the backSportsL1
        binding.startButton.setOnClickListener {
            findNavController().navigate(R.id.action_molahzaFragment_to_qwamolahzaFragment)
        }

        // Using findNavController() to navigate From malhozaScreen To MainScreen When Press the returnButton2
        binding.returnButton2.setOnClickListener {
            findNavController().navigate(R.id.action_molahzaFragment_to_mainFragment)
        }
        return binding.root
    }

}