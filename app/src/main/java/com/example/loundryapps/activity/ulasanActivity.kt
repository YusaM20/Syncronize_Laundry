package com.example.loundryapps.activity

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.loundryapps.R
import com.example.loundryapps.databinding.ActivityUlasanBinding

class ulasanActivity : AppCompatActivity() {

    lateinit var binding : ActivityUlasanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ulasan)

        binding = ActivityUlasanBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val btnbeck: ImageView = binding.beck
        btnbeck.setOnClickListener {
           onBackPressed()
        }

        binding.ulas.setOnClickListener {
            setViewUlas()
        }
        binding.ulasanda.setOnClickListener {
            setViewUlasanda()

        }

    }

    private fun setViewUlasanda() {
        binding.apply {

            ulsan.visibility = View.GONE
        }

    }

    private fun setViewUlas() {
        binding.apply {

            ulsan.visibility = View.VISIBLE
        }


    }
}