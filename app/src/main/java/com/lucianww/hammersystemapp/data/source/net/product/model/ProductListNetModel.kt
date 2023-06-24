package com.lucianww.hammersystemapp.data.source.net.product.model

import com.google.gson.annotations.SerializedName


data class ProductListNetModel(

    @SerializedName("meals")
    val productList: List<ProductNetModel>

)