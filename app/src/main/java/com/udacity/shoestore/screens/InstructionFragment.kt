package com.udacity.shoestore.screens

import android.database.DatabaseUtils
import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentInstructionBinding


class InstructionFragment : Fragment() {
   ;lateinit var binding: FragmentInstructionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_instruction,container,false)
        binding.instructionsButton.setOnClickListener { findNavController().navigate(InstructionFragmentDirections.actionInstructionFragmentToShoeListFragment()) }
        // Inflate the layout for this fragment
        return binding.root
    }


}