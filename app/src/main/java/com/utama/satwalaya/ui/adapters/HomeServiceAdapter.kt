package com.utama.satwalaya.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.utama.satwalaya.data.ServiceItem
import com.utama.satwalaya.databinding.ItemServiceMainBinding

class HomeServiceAdapter(private val items: List<ServiceItem>) :
    RecyclerView.Adapter<HomeServiceAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemServiceMainBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemServiceMainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.binding.tvServiceName.text = item.name
        holder.binding.tvServiceDesc.text = item.description
        // You can set custom icon colors or icons here based on item
    }

    override fun getItemCount() = items.size
}