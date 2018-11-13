package com.example.shakeib.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.TextureView
import android.view.View
import android.widget.TextView

class MyViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    var myText = view.findViewById<TextView>(R.id.myTv)
}