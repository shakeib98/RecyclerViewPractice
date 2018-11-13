package com.example.shakeib.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var data = arrayListOf("Hi","Hello","How","Are","You","?","Hi","Hello","How","Are","You","?","Hi","Hello","How","Are","You","?","Hi","Hello","How","Are","You","?","Hi","Hello","How","Are","You","?")

        rView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)
        rView.adapter = MyAdapter(R.layout.r_view,data,::onClickI)
    }

    fun onClickI(position:Int){
        Toast.makeText(this,position.toString(),Toast.LENGTH_SHORT).show()
    }


}
