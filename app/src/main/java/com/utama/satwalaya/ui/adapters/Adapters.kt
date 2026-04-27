package com.utama.satwalaya.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.utama.satwalaya.R
import com.utama.satwalaya.data.HistoryItem
import com.utama.satwalaya.data.RecommendItem
import com.utama.satwalaya.data.ReviewItem
import com.utama.satwalaya.data.ServiceItem
import com.utama.satwalaya.databinding.ItemHistoryBinding
import com.utama.satwalaya.databinding.ItemRecommendBinding
import com.utama.satwalaya.databinding.ItemReviewBinding
import com.utama.satwalaya.databinding.ItemServiceBinding

class ServiceAdapter(private val items: List<ServiceItem>) : 
    RecyclerView.Adapter<ServiceAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemServiceBinding) : RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = 
        ViewHolder(ItemServiceBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.binding.tvServiceName.text = item.name
        holder.binding.tvServiceDesc.text = item.description
        holder.binding.tvServicePrice.text = item.price
        
        // Dinamis Icon berdasarkan nama layanan
        val context = holder.binding.root.context
        when {
            item.name.contains("Hotel", true) -> {
                holder.binding.ivServiceIcon.setImageResource(R.drawable.ic_home)
                holder.binding.cvIcon.setCardBackgroundColor(ContextCompat.getColor(context, R.color.grad_orange))
            }
            item.name.contains("Grooming", true) -> {
                holder.binding.ivServiceIcon.setImageResource(R.drawable.ic_grooming)
                holder.binding.cvIcon.setCardBackgroundColor(ContextCompat.getColor(context, R.color.grad_purple))
            }
            item.name.contains("Pick Up", true) || item.name.contains("Pickup", true) -> {
                holder.binding.ivServiceIcon.setImageResource(R.drawable.ic_pickup)
                holder.binding.cvIcon.setCardBackgroundColor(ContextCompat.getColor(context, R.color.grad_blue))
            }
        }
    }
    override fun getItemCount() = items.size
}

class RecommendAdapter(private val items: List<RecommendItem>) : 
    RecyclerView.Adapter<RecommendAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemRecommendBinding) : RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = 
        ViewHolder(ItemRecommendBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.binding.tvRecommendTitle.text = item.title
        holder.binding.tvRecommendPrice.text = item.price
    }
    override fun getItemCount() = items.size
}

class HistoryAdapter(private val items: List<HistoryItem>) : 
    RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemHistoryBinding) : RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = 
        ViewHolder(ItemHistoryBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.binding.tvHistoryService.text = item.serviceName
        holder.binding.tvHistoryDate.text = item.date
        holder.binding.tvHistoryStatus.text = item.status
        
        // Dinamis Icon berdasarkan nama layanan di History
        val context = holder.binding.root.context
        when {
            item.serviceName.contains("Hotel", true) -> {
                holder.binding.ivServiceIcon.setImageResource(R.drawable.ic_home)
                holder.binding.cvIcon.setCardBackgroundColor(ContextCompat.getColor(context, R.color.grad_orange))
            }
            item.serviceName.contains("Grooming", true) -> {
                holder.binding.ivServiceIcon.setImageResource(R.drawable.ic_grooming)
                holder.binding.cvIcon.setCardBackgroundColor(ContextCompat.getColor(context, R.color.grad_purple))
            }
            item.serviceName.contains("Pick Up", true) || item.serviceName.contains("Pickup", true) -> {
                holder.binding.ivServiceIcon.setImageResource(R.drawable.ic_pickup)
                holder.binding.cvIcon.setCardBackgroundColor(ContextCompat.getColor(context, R.color.grad_blue))
            }
        }
    }
    override fun getItemCount() = items.size
}

class ReviewAdapter(private val items: List<ReviewItem>) : 
    RecyclerView.Adapter<ReviewAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemReviewBinding) : RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = 
        ViewHolder(ItemReviewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.binding.tvReviewerName.text = item.reviewerName
        holder.binding.tvReviewContent.text = item.content
        holder.binding.rbReview.rating = item.rating
    }
    override fun getItemCount() = items.size
}