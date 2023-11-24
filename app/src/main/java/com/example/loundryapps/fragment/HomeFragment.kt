package com.example.loundryapps.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.loundryapps.MapActivity
import com.example.loundryapps.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root

        val btnHuhu: ImageView = binding.huhu
        btnHuhu.setOnClickListener { btnHuhu() }
    }

//    override fun onViewCreated (view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//    }
    private fun btnHuhu() {
        val i = Intent(requireActivity(), MapActivity::class.java)
        startActivity(i)
    }

}