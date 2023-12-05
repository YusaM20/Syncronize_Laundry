package com.example.loundryapps.activity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.loundryapps.R
import com.example.loundryapps.databinding.ActivityWashBinding

class washActivity : AppCompatActivity() {

    lateinit var binding : ActivityWashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wash)

        binding = ActivityWashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnHuhu: ImageView = binding.order
        btnHuhu.setOnClickListener {
            setViewOrder()
        }
    }

    private fun setViewOrder() {
        val intent = Intent(this, PesanActivity::class.java)
        startActivity(intent)

    }
}