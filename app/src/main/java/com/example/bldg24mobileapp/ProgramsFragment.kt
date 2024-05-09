package com.example.bldg24mobileapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class ProgramsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_programs,
            container, false)
        val showProgramsButton = view.findViewById<Button>(R.id.buttonViewMapId)
        // code that runs when the button is clicked
        showProgramsButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_programsFragment_to_mapFragment)
        }
        return view
    }
}