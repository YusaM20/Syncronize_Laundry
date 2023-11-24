package com.example.loundryapps.Login

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.WindowInsets
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.loundryapps.databinding.ActivityAwalBinding

@SuppressLint("CostumSplashScrenn")
class awal : AppCompatActivity() {

    private lateinit var binding : ActivityAwalBinding
    lateinit var handler: Handler
    private val timer = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAwalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupView()

        handler = Handler()
        handler.postDelayed({
            startActivity(Intent(this, login::class.java))
            finish()
        }, timer.toLong())
    }

    private fun setupView() {
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        supportActionBar?.hide()
    }
}