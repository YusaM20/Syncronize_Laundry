package com.example.loundryapps.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.loundryapps.R
import com.example.loundryapps.databinding.ActivityPesanBinding

class PesanActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding : ActivityPesanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesan)

        val btn : ImageView = findViewById(R.id.fold)
        btn.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.fold ->{
                val intent = Intent(this, AddActivity::class.java)
                startActivity(intent)
            }
        }
    }
}