package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            var bundle = Bundle()
            bundle.putString("input_text", "Manish Prabhakar")
            bundle.putInt("roll_no", 7656140)
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<BlankFragment>(R.id.fragment_container_view, args = bundle)
            }
        }
    }

}