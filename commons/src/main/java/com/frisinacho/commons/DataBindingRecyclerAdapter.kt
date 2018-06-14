package com.frisinacho.commons

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

class DataBindingRecyclerAdapter<MODEL> (val itemLayoutResId: Int) : RecyclerView.Adapter<DataBindingViewHolder<MODEL>>() {

    val items = mutableListOf<MODEL>()

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataBindingViewHolder<MODEL> {
        val view = parent.inflate(itemLayoutResId)
        return DataBindingViewHolder(view)
    }

    override fun onBindViewHolder(holder: DataBindingViewHolder<MODEL>, position: Int) {
        val item = items[position]
        holder.bindItem(item)
    }

}