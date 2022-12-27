package com.example.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class BlankFragment2 : Fragment(R.layout.fragment_blank2)
{
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        val someInt = requireArguments().getString("input_text")
        val roll = requireArguments().getInt("roll_no")
        Toast.makeText(this@BlankFragment2.requireActivity(), someInt+"<------>"+roll.toString(), Toast.LENGTH_SHORT).show()
    }
}