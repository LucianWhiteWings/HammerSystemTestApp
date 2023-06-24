package com.lucianww.hammersystemapp.presentation.menu.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.lucianww.hammersystemapp.databinding.ItemCategoryBinding
import com.lucianww.hammersystemapp.presentation.menu.model.CategoryUIModel

class CategoryAdapter(
    private var clickListener: OnCategoryClickListener,
    private val context: Context
) : RecyclerView.Adapter<CategoryViewHolder>() {

    private var data: List<CategoryUIModel> = mutableListOf()






    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val b : ItemCategoryBinding = ItemCategoryBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )

        return CategoryViewHolder(b, clickListener, context)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(data[position])
    }

    fun setData(newList: List<CategoryUIModel>) {
        val diffResult = DiffUtil.calculateDiff(CategoryDiffCallback(newList, data))
        diffResult.dispatchUpdatesTo(this)
        data = newList
    }


    fun setSelected(item: CategoryUIModel){
        for(i in 0 until itemCount){
            data[i].isSelected = false
        }
        data[data.indexOf(item)].isSelected = true
        notifyDataSetChanged()
    }



    interface OnCategoryClickListener {
        fun onClick(view: View)
    }

}