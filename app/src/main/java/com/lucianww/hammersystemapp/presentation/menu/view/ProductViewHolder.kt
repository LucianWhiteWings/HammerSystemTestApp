package com.lucianww.hammersystemapp.presentation.menu.view

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lucianww.hammersystemapp.databinding.ItemProductBinding
import com.lucianww.hammersystemapp.presentation.menu.model.ProductUIModel

class ProductViewHolder(
    private val binding: ItemProductBinding,
    onClickListener: ProductAdapter.OnProductClickListener,
    data: List<ProductUIModel>
) : RecyclerView.ViewHolder(binding.root) {

    init {
        binding.root.setOnClickListener { onClickListener.onClick(data[adapterPosition])}
    }

    fun bind(product: ProductUIModel) {
        binding.tvTitle.text = product.title
        binding.tvDescription.text = product.description

        binding.btnPrice.text = "от ${product.price} р"


        Glide.with(binding.imgProduct)
            .load(product.url)
            .into(binding.imgProduct)

    }
}