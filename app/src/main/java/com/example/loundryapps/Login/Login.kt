package com.example.loundryapps.Login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loundryapps.R
import com.example.loundryapps.databinding.ActivityLoginBinding
import com.example.loundryapps.fragment.HomeFragment

class login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.logugle.setOnClickListener { loginwithFbGoogle() }
        binding.daftr.setOnClickListener { regis() }
        binding.log.setOnClickListener { logint() }


    }

    private fun loginwithFbGoogle() {
        val i = Intent(this, HomeFragment::class.java)
        startActivity(i)
    }

    private fun regis() {
        val i = Intent(this, daftar::class.java)
        startActivity(i)
    }

    private fun logint() {
        val i = Intent(this, login1::class.java)
        startActivity(i)
    }


}