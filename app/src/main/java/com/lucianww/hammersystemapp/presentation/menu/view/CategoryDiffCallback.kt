package com.lucianww.hammersystemapp.presentation.menu.view

import androidx.recyclerview.widget.DiffUtil
import com.lucianww.hammersystemapp.presentation.menu.model.CategoryUIModel

class CategoryDiffCallback(
    private var newMeals: List<CategoryUIModel>,
    private var oldMeal: List<CategoryUIModel>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldMeal.size

    override fun getNewListSize(): Int = newMeals.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        (oldMeal[oldItemPosition].id == newMeals[newItemPosition].id)

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        (oldMeal[oldItemPosition] == newMeals[newItemPosition])

}