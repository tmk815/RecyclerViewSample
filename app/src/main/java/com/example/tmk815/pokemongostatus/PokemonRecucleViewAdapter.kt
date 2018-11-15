package com.example.tmk815.pokemongostatus

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class PokemonRecycleViewAdapter(private val pkmName:List<String>,private val type1:List<String>): RecyclerView.Adapter<ListItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.listitem,parent,false)
        return ListItemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return pkmName.size
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.name?.text=pkmName[position]
        holder.type1?.text=type1[position]
    }
}