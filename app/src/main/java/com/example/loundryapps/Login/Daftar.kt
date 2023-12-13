package com.example.loundryapps.Login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loundryapps.R
import com.example.loundryapps.databinding.ActivityDaftarBinding
import com.google.firebase.auth.FirebaseAuth


class daftar : AppCompatActivity() {
    private lateinit var binding: ActivityDaftarBinding
    private lateinit var firebaseAuth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        binding = ActivityDaftarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.summit.setOnClickListener {
          val email = binding.emil.text.toString()
            val password = binding.pass.text.toString()
            val conpass = binding.conpass.text.toString()

            if(email.isNotEmpty() && password.isNotEmpty() && conpass.isNotEmpty()){
                if(password == conpass){

                    firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
                        if (it.isSuccessful){
                            val intent = Intent(this , login1::class.java)
                            startActivity(intent)
                        }else {
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }
                }else {
                    Toast.makeText(this, "password tidak sama la", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "isi data tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
        }
    }
}