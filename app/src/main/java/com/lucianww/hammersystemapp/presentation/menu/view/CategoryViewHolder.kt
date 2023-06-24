package com.lucianww.hammersystemapp.presentation.menu.view

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.lucianww.hammersystemapp.R
import com.lucianww.hammersystemapp.databinding.ItemCategoryBinding
import com.lucianww.hammersystemapp.presentation.menu.model.CategoryUIModel

class CategoryViewHolder (
    private val binding: ItemCategoryBinding,
    onClickListener: CategoryAdapter.OnCategoryClickListener,
    private val context: Context
) :
    RecyclerView.ViewHolder(binding.root) {

    init {
        binding.root.setOnClickListener{ onClickListener.onClick(binding.root)}

    }

    fun bind(category: CategoryUIModel) {
        binding.tvCategory.text = category.title
        binding.root.tag = category
        if(category.isSelected) {
            binding.root.setBackgroundResource(R.drawable.categort_selected_item)
            binding.tvCategory.setTextColor(context.getColor(R.color.main_select))
        }
        else {
            binding.root.setBackgroundResource(R.drawable.category_item)
            binding.tvCategory.setTextColor(context.getColor(R.color.categoryText))
        }

    }


}