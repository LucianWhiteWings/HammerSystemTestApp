package com.lucianww.hammersystemapp.data.source.net.api

import com.lucianww.hammersystemapp.data.source.net.product.model.ProductListNetModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ProductApi {

    @GET("filter.php")
    suspend fun getProductListResponse(@Query("c") category: String): ProductListNetModel
}