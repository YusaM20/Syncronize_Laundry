package com.example.loundryapps.Login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loundryapps.Nav.Navbar
import com.example.loundryapps.R
import com.example.loundryapps.databinding.ActivityLogin1Binding

class login1 : AppCompatActivity() {
    private lateinit var binding: ActivityLogin1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)

        binding = ActivityLogin1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener { back() }
        binding.daftr.setOnClickListener { regis() }
        binding.masuk.setOnClickListener{masuk()}
    }
    private fun back() {
        val i = Intent(this, login::class.java)
        startActivity(i)
    }
    private fun regis() {
        val i = Intent(this, daftar::class.java)
        startActivity(i)
    }
    private fun masuk() {
        val i = Intent(this, Navbar::class.java)
        startActivity(i)
    }
}