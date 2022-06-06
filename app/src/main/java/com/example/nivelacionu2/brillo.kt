package com.example.nivelacionu2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nivelacionu2.databinding.FragmentBrilloBinding
import com.example.nivelacionu2.databinding.FragmentHomeBinding

class brillo : Fragment() {
    private lateinit var binding: FragmentBrilloBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_brillo, container, false)
    }

}