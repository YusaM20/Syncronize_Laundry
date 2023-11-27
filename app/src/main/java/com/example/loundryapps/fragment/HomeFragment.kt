package com.example.loundryapps.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.loundryapps.activity.MapActivity
import com.example.loundryapps.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val btnHuhu: TextView = binding.saying
        btnHuhu.setOnClickListener {
            navigateToMapActivity()
        }

        return root
    }

    private fun navigateToMapActivity() {
        val intent = Intent(requireActivity(), MapActivity::class.java)
        startActivity(intent)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}












//package com.example.loundryapps.fragment
//
//import android.content.Intent
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.fragment.app.Fragment
//import com.example.loundryapps.activity.MapActivity
//import com.example.loundryapps.databinding.FragmentHomeBinding
//
//class HomeFragment : Fragment() {
//    private var _binding: FragmentHomeBinding? = null
//    private val binding get() = _binding!!
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        // Inflate the layout for this fragment
//        _binding = FragmentHomeBinding.inflate(inflater, container, false)
//        val root: View = binding.root
//
//        return root
//
//        val btnHuhu: TextView = binding.saying
//        btnHuhu.setOnClickListener { btnHuhu() }
//    }
//
//
//    private fun btnHuhu() {
//        val i = Intent(requireActivity(), MapActivity::class.java)
//        startActivity(i)
//    }
//    }
