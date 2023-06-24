package com.lucianww.hammersystemapp.presentation.menu.model

data class ProductUIModel(
    val id: String,
    val title: String,
    val url: String,
    val description: String = "",
    val price: Int = 0
)