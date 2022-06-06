package com.example.nivelacionu2

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.nivelacionu2.databinding.FragmentHomeBinding

class Home : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(layoutInflater)
        binding.wifi.setOnClickListener(){
            val navController =findNavController()
            val direction = HomeDirections.actionHome2ToWifi()
            findNavController().navigate(direction)
        }
        binding.blueto.setOnClickListener(){
            val navController =findNavController()
            val direction = HomeDirections.actionHome2ToBluet()
            findNavController().navigate(direction)
        }
        binding.brillo.setOnClickListener(){
            val navController =findNavController()
            val direction = HomeDirections.actionHome2ToBrillo()
            findNavController().navigate(direction)
        }
        binding.lampara.setOnClickListener(){
            val navController =findNavController()
            val direction = HomeDirections.actionHome2ToLinterna()
            findNavController().navigate(direction)
        }
        binding.avion.setOnClickListener(){
            val navController =findNavController()
            val direction = HomeDirections.actionHome2ToAvion()
            findNavController().navigate(direction)
        }
        binding.sonido.setOnClickListener(){
            val navController =findNavController()
            val direction = HomeDirections.actionHome2ToTimbre()
            findNavController().navigate(direction)
        }
        return binding.root
    }
}