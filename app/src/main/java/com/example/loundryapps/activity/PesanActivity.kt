package com.example.laundryease.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.laundryease.R

class PesanActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesan)

        val btn : ImageView = findViewById(R.id.fold)
        btn.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.fold ->{
                val intent = Intent(this@PesanActivity, AddActivity::class.java)
                startActivity(intent)
            }
        }
    }
}