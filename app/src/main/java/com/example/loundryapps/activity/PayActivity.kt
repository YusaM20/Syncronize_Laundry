package com.example.loundryapps.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.loundryapps.R

class PayActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)

        val btn : ImageView = findViewById(R.id.pycon)
        btn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.pycon ->{
                    val intent = Intent(this, ConpayActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}