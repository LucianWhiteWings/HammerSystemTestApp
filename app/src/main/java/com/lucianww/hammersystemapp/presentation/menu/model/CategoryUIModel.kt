package com.lucianww.hammersystemapp.presentation.menu.model

data class CategoryUIModel(
    val id: String,
    val title: String,
    val url: String,
    var isSelected: Boolean = false
)

