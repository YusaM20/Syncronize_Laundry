package com.example.loundryapps.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.loundryapps.Nav.Navbar
import com.example.loundryapps.activity.MessageActivity
import com.example.loundryapps.activity.NotifikasiActivity
import com.example.loundryapps.activity.ulasanActivity
import com.example.loundryapps.databinding.FragmentInboxBinding

class InboxFragment : Fragment() {
    private var _binding: FragmentInboxBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInboxBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val btnbeck: ImageView = binding.beck
        btnbeck.setOnClickListener {
            onBackPressed()
        }

        val btnHuhu: TextView = binding.ulasan
        btnHuhu.setOnClickListener {
            naviToUlas()
        }
        val btnnot: TextView = binding.notif
        btnnot.setOnClickListener {
            naviToNotif()
        }
        val btnnes: TextView = binding.mess
        btnnes.setOnClickListener {
            naviToMess()
        }


        return root
    }

    private fun naviToMess() {
        val intent = Intent(requireActivity(), MessageActivity::class.java)
        startActivity(intent)
    }

    private fun onBackPressed() {
        val intent = Intent(requireActivity(), Navbar::class.java)
        startActivity(intent)
    }

    private fun naviToUlas() {
        val intent = Intent(requireActivity(), ulasanActivity::class.java)
        startActivity(intent)
    }
    private fun naviToNotif() {
        val intent = Intent(requireActivity(), NotifikasiActivity::class.java)
        startActivity(intent)
    }
}