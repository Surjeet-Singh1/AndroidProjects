package com.example.wavesoffood.adaptar


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wavesoffood.databinding.PopularItemBinding

class PopularAdaptar (private val items: List<String>,private val price:List<String>,private val image:List<Int>): RecyclerView.Adapter<PopularAdaptar.PopularViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
       return PopularViewHolder(PopularItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: PopularAdaptar.PopularViewHolder, position: Int) {
       val item=items[position]
        val images=image[position]
        val prices=price[position]
        holder.bind(item,prices,images)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class PopularViewHolder(private val binding: PopularItemBinding): RecyclerView.ViewHolder(binding.root) {
        val imageView=binding.imageView6
        fun bind(item:String, prices: String,images: Int) {
            binding.foodNamePopular.text=item
            binding.pricePopular.text= prices
            imageView.setImageResource(images)
        }
    }
}