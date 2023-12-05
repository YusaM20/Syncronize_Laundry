package com.example.loundryapps.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.loundryapps.R
import com.example.loundryapps.data.adapter
import com.example.loundryapps.data.item

class AddActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<item>
    lateinit var titleimage : Array<Int>
    lateinit var image : Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        val btn : ImageView = findViewById(R.id.btnadd)
        btn.setOnClickListener(this)

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

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.btnadd ->{
                    val intent = Intent(this, ConfirmActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}