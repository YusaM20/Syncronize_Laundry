package com.example.loundryapps.Login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loundryapps.Nav.Navbar
import com.example.loundryapps.R
import com.example.loundryapps.databinding.ActivityLogin1Binding
import com.google.firebase.auth.FirebaseAuth

class login1 : AppCompatActivity() {
    private lateinit var binding: ActivityLogin1Binding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)

        binding = ActivityLogin1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.back.setOnClickListener { back() }
        binding.daftr.setOnClickListener { regis() }
        binding.masuk.setOnClickListener{
            val email = binding.emil.text.toString()
            val password = binding.pass.text.toString()


            if(email.isNotEmpty() && password.isNotEmpty()){
                firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener {
                    if (it.isSuccessful){
                        val intent = Intent(this, Navbar::class.java)
                        startActivity(intent)
                    }else {
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }

            }else {
                    Toast.makeText(this, "isi data tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun back() {
        val i = Intent(this, login::class.java)
        startActivity(i)
    }
    private fun regis() {
        val i = Intent(this, daftar::class.java)
        startActivity(i)
    }

}