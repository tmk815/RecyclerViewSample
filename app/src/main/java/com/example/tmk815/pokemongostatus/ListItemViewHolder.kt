package com.example.tmk815.pokemongostatus

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ListItemViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    val name:TextView?=itemView.findViewById(R.id.name)
    val type1:TextView?=itemView.findViewById(R.id.type1)
}