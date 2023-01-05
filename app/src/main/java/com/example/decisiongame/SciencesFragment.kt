package com.example.decisiongame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentSciencesBinding
import com.example.decisiongame.databinding.FragmentSportsBinding

class SciencesFragment : Fragment() {

    private lateinit var binding : FragmentSciencesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment by using DataBinding
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_sciences,container,false)


        // Using findNavController() to navigate From Sciences To LevelOne
        binding.startSciencesL1.setOnClickListener {
            findNavController().navigate(R.id.action_sciencesFragment_to_sciencesLevel1Fragment)
        }
        // Using findNavController() to navigate From Sciences To Items When Press the backSciencesL1
        binding.backSciencesL1.setOnClickListener {
            findNavController().navigate(R.id.action_sciencesFragment_to_itemsOfMaalomaGameFragment)
        }

        return binding.root
    }

}