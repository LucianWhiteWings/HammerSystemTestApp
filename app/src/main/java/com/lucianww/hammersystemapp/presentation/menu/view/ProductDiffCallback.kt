package com.lucianww.hammersystemapp.presentation.menu.view

import androidx.recyclerview.widget.DiffUtil
import com.lucianww.hammersystemapp.presentation.menu.model.ProductUIModel

class ProductDiffCallback(
    private var newMeals: List<ProductUIModel>,
    private var oldMeals: List<ProductUIModel>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldMeals.size

    override fun getNewListSize(): Int = newMeals.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldMeals[oldItemPosition].id == newMeals[newItemPosition].id

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldMeals[oldItemPosition] == newMeals[newItemPosition]

}