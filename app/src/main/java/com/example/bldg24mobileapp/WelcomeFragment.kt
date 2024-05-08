package com.example.bldg24mobileapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class WelcomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome,
            container, false)
        val showProgramsButton = view.findViewById<Button>(R.id.buttonShowProgramId)
        // code that runs when the button is clicked
        showProgramsButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_welcomeFragment_to_programsFragment)
        }
        return view
    }
}