package com.example.decisiongame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentHistoryBinding
import com.example.decisiongame.databinding.FragmentSciencesBinding

class HistoryFragment : Fragment() {

    private lateinit var binding: FragmentHistoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment by using DataBinding
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_history,container,false)

        // Using findNavController() to navigate From History To historyLevel1Fragment
        binding.startHistoryL1.setOnClickListener {
            findNavController().navigate(R.id.action_historyFragment_to_historyLevel1Fragment)
        }

        // Using findNavController() to navigate From History To Items When Press the backHistoryL1
        binding.backHistoryL1.setOnClickListener {
            findNavController().navigate(R.id.action_historyFragment_to_itemsOfMaalomaGameFragment)
        }

        return binding.root
    }

}