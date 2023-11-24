package com.example.loundryapps.Login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loundryapps.R
import com.example.loundryapps.databinding.ActivityDaftarBinding

class daftar : AppCompatActivity() {
    private lateinit var binding: ActivityDaftarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        binding = ActivityDaftarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.summit.setOnClickListener { log() }
    }

    private fun log() {
        val i = Intent(this, login1::class.java)
        startActivity(i)
    }
}