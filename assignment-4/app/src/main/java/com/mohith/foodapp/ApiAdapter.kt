package com.mohith.foodapp
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mohith.foodapp.databinding.ItemsBinding

class ApiAdapter(): RecyclerView.Adapter<ApiAdapter.ApiViewHolder>() {

    private var foodList = ArrayList<Data>()

    fun setMealList(charList : List<Data>){
        this.foodList = charList as ArrayList<Data>
        notifyDataSetChanged()
    }


    class ApiViewHolder(val binding: ItemsBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApiViewHolder {
        return ApiViewHolder(ItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ApiViewHolder, position: Int) {
        Glide.with(holder.itemView)
            .load(foodList[position].PrdImageUrl)
            .into(holder.binding.imageView)
        holder.binding.textView.text = foodList[position].PrdName
        holder.binding.price.text = foodList[position].PrdPrice
    }

    override fun getItemCount(): Int {
        return foodList.size
    }
}