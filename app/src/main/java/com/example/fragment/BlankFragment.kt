package com.example.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.*

class BlankFragment : Fragment(R.layout.fragment_blank) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        val someInt = requireArguments().getString("input_text")
        val roll = requireArguments().getInt("roll_no")
        var txtvw = view.findViewById<TextView>(R.id.txtvw)
        txtvw.text = someInt
        Toast.makeText(this@BlankFragment.requireActivity(), roll.toString(), Toast.LENGTH_SHORT).show()

        var buttonfrg = view.findViewById<Button>(R.id.btnfrgtofrg)
        buttonfrg.setOnClickListener { view ->
            var bundle=Bundle()
            bundle.putString("input_text","Manish Prabhakar")
            bundle.putInt("roll_no",7656140)
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentManager?.commit {
                setReorderingAllowed(true)
                replace<BlankFragment2>(R.id.fragment_container_view, args = bundle)

            }


        }
    }
}