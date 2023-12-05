package com.example.loundryapps.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loundryapps.R

class ConfirmActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)

        val btn : ImageView = findViewById(R.id.pay)
        btn.setOnClickListener(this)

        val spinerId = findViewById<Spinner>(R.id.curira)
        val spineriD = findViewById<Spinner>(R.id.curire)

        val currier = arrayOf("Dikirim sendiri(0)","Curier outlet")
        val arrayadp = ArrayAdapter(this@ConfirmActivity,android.R.layout.simple_spinner_dropdown_item,currier)

        spinerId.adapter = arrayadp
        spineriD.adapter = arrayadp

        spineriD?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@ConfirmActivity, "item is ${currier[position]}",Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@ConfirmActivity, "Nothing select",Toast.LENGTH_LONG).show()
            }

        }
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.pay ->{
                    val intent = Intent(this, PayActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}