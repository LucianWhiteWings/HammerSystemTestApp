package com.lucianww.hammersystemapp.data.source.net.category.model

import com.google.gson.annotations.SerializedName

data class CategoryListNetModel (

    @SerializedName("categories")
    val categoryList: List<CategoryNetModel>
)