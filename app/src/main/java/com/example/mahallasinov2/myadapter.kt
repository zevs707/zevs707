package com.example.mahallasinov2

import android.animation.LayoutTransition
import android.app.LauncherActivity
import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.view.animation.LinearInterpolator
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class myadapter (listArray: ArrayList<listwiew>, context: Context): RecyclerView.Adapter<myadapter.ViewHolder>() {

    val listArrarR = listArray
    var contextx = context

    class ViewHolder (view: View):RecyclerView.ViewHolder(view) {
        val tvTitle = view.findViewById<TextView>(R.id.tv_shablonViloyatlar)
        fun bind(listItem:listwiew,context: Context)
        {
            tvTitle.text = listItem.titleText
            itemView.setOnClickListener(){
                Toast.makeText(context,"pressed : ${tvTitle.text}", Toast.LENGTH_SHORT).show()
            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(contextx)
        return ViewHolder(inflater.inflate(R.layout.viloyatshablon,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        var listItem = listArrarR.get(position)
        holder.bind(listItem,contextx)

    }

    override fun getItemCount(): Int {
        return listArrarR.size
    }
}