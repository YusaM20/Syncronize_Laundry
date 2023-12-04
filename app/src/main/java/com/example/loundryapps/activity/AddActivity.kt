package com.example.loundryapps.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.laundryease.UI.data.adapter
import com.example.laundryease.UI.data.item
import com.example.loundryapps.R

class AddActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<item>
    lateinit var titleimage : Array<Int>
    lateinit var image : Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        titleimage = arrayOf(
            R.drawable.baju,
            R.drawable.cardi,
            R.drawable.cd,
            R.drawable.pans,
            R.drawable.spans,
            R.drawable.dasi,
            R.drawable.gamis,
            R.drawable.jaket,
            R.drawable.hoodie,
            R.drawable.kaos,
            R.drawable.kkaki,
            R.drawable.kemeja,
            R.drawable.batik,
            R.drawable.rompi,
            R.drawable.stangan,
            R.drawable.skulit,
            R.drawable.sweat,
            R.drawable.tpi,
        )
        image = arrayOf(
            R.drawable.plus,
            R.drawable.plus,
            R.drawable.plus,
            R.drawable.plus,
            R.drawable.plus,
            R.drawable.plus,
            R.drawable.plus,
            R.drawable.plus,
            R.drawable.plus,
            R.drawable.plus,
            R.drawable.plus,
            R.drawable.plus,
            R.drawable.plus,
            R.drawable.plus,
            R.drawable.plus,
            R.drawable.plus,
            R.drawable.plus,
            R.drawable.plus,
        )

        newRecyclerView = findViewById(R.id.rcycle)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)


        newArrayList = arrayListOf<item>()
        getUserData()


    }

    private fun getUserData() {

        for(i in titleimage.indices){
            val item = item(titleimage[i],image[i])
            newArrayList.add(item)
        }

        newRecyclerView.adapter = adapter(newArrayList)
    }
}