package com.example.shakeib.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast

class MyAdapter(var layoutID:Int,var data:ArrayList<String>,var onClickItem:(Int)->Unit) : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        var view = LayoutInflater.from(p0.context).inflate(layoutID,p0,false)

        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = data.size


    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
        p0.myText.text = data[p1]
        p0.itemView.setOnClickListener {
            onClickItem(p1)
        }
    }


}