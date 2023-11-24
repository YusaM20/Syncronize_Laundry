package com.example.loundryapps.Nav

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.loundryapps.R
import com.example.loundryapps.fragment.HomeFragment
import com.example.loundryapps.fragment.InboxFragment
import com.example.loundryapps.fragment.OrderFragment
import com.example.loundryapps.fragment.ProfileFragment
import com.qamar.curvedbottomnaviagtion.CurvedBottomNavigation

class Navbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navbar)

        val bottomNavigation = findViewById<CurvedBottomNavigation>(R.id.bottomNavigation)
        bottomNavigation.add(
            CurvedBottomNavigation.Model(1,"Home",R.drawable.home)
        )
        bottomNavigation.add(
            CurvedBottomNavigation.Model(2,"Order",R.drawable.order)
        )
        bottomNavigation.add(
            CurvedBottomNavigation.Model(3,"Inbox",R.drawable.inbox)
        )
        bottomNavigation.add(
            CurvedBottomNavigation.Model(4,"Order",R.drawable.profil)
        )

        bottomNavigation.setOnClickMenuListener {
            when(it.id) {
                1 -> {
                    replaceFragment(HomeFragment())
                }

                2 -> {
                    replaceFragment(OrderFragment())
                }

                3 -> {
                    replaceFragment(InboxFragment())
                }
                4 -> {
                    replaceFragment(ProfileFragment())
                }
            }
        }

        replaceFragment(HomeFragment())
        bottomNavigation.show(1)
    }
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragcontiner,fragment)
            .commit()


    }
}

