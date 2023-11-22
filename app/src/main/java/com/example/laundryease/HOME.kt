package com.example.laundryease

import android.os.Bundle
import android.content.Intent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class HOME : Fragment(), View.OnClickListener {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        val btnequipper: Button = view.findViewById(R.id.button_washandfold)
//        btnequipper.setOnClickListener(this)
//
//        val btnartikel: Button = view.findViewById(R.id.button_washandiron)
//        btnartikel.setOnClickListener(this)
//
//        val btnebook: Button = view.findViewById(R.id.button_dryclean)
//        btnebook.setOnClickListener(this)
//
//        val btnchat: Button = view.findViewById(R.id.button_premium)
//        btnchat.setOnClickListener(this)
//
//        val btnshare: Button = view.findViewById(R.id.kilolaundry)
//        btnshare.setOnClickListener(this)
//
//        val btnnotif: Button = view.findViewById(R.id.button_order)
//        btnnotif.setOnClickListener(this)
//
//        val btnnotif: Button = view.findViewById(R.id.button_inbox)
//        btnnotif.setOnClickListener(this)
//
//        val btnnotif: Button = view.findViewById(R.id.button_profile)
//        btnnotif.setOnClickListener(this)
//    }

//    override fun onClick(v: View?) {
//        if (v?.id == R.id.button_quipper){
//            val intent = Intent(activity, washandfold::class.java)
//            startActivity(intent)
//        }
//        if (v?.id == R.id.button_artikel){
//            val intent = Intent(activity, ArtikelYolaActivity::class.java)
//            startActivity(intent)
//        }
//        if (v?.id == R.id.button_ebook){
//            val intent = Intent(activity, EbookActivity::class.java)
//            startActivity(intent)
//        }
//        if (v?.id == R.id.button_chat){
//            val intent = Intent(activity, ChatActivity::class.java)
//            startActivity(intent)
//        }
//        if (v?.id == R.id.button_share){
//            val intent = Intent(activity, PusatBantuanActivity::class.java)
//            startActivity(intent)
//        }
//        if (v?.id == R.id.button_notif){
//            val intent = Intent(activity, NotifActivity::class.java)
//            startActivity(intent)
//        }
//    }
}