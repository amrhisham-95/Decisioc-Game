package com.example.decisiongame

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.decisiongame.databinding.FragmentSciencesLevel2Binding
import com.example.decisiongame.databinding.FragmentSportsLevel2Binding

class SciencesLevel2Fragment : Fragment() {

    private lateinit var binding :FragmentSciencesLevel2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = DataBindingUtil.inflate(inflater,R.layout.fragment_sciences_level2,container,false)

        // Using findNavController() to navigate From sciencesLevel1Fragment To itemsScreen
        binding.returnButtonLv2Sciences.setOnClickListener {
            findNavController().navigate(R.id.action_sciencesLevel2Fragment_to_sciencesLevel1Fragment)
        }



        binding.goNextLv2Sciences.setOnClickListener {
            if (binding.radioButton2Lv2Sciences.isChecked && binding.radioButton5Lv2Sciences.isChecked && binding.radioButton9Lv2Sciences.isChecked) {
                findNavController().navigate(R.id.action_sciencesLevel2Fragment_to_sciencesLevel3Fragment)
            } else {
                binding.goNextLv2Sciences.text = "TRY AGAIN"
                binding.goNextLv2Sciences.setBackgroundColor(Color.RED)
            }
        }


        return  binding.root
    }

}