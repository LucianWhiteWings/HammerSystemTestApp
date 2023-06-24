package com.lucianww.hammersystemapp.presentation.menu.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.lucianww.hammersystemapp.databinding.ItemProductBinding
import com.lucianww.hammersystemapp.presentation.menu.model.ProductUIModel

class ProductAdapter (
        private var clickListener: OnProductClickListener
) : RecyclerView.Adapter<ProductViewHolder>() {

    private var data: List<ProductUIModel> = mutableListOf()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val b: ItemProductBinding = ItemProductBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )

        return ProductViewHolder(b, clickListener, data)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(data[position])
    }

    fun setData(newList: List<ProductUIModel>) {
        val diffResult = DiffUtil.calculateDiff(ProductDiffCallback(newList, data))
        diffResult.dispatchUpdatesTo(this)
        data = newList
    }


    interface OnProductClickListener{
        fun onClick(item: ProductUIModel)
    }
}