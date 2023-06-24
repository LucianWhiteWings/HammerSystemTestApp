package com.lucianww.hammersystemapp.data.source.net.product.model

import com.google.gson.annotations.SerializedName

data class ProductNetModel (

    @SerializedName("idMeal")
    val id: String,

    @SerializedName("strMeal")
    val title: String,

    @SerializedName("strMealThumb")
    val thumb: String
)