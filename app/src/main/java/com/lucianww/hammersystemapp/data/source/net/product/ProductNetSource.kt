package com.lucianww.hammersystemapp.data.source.net.product

import com.lucianww.hammersystemapp.data.source.net.api.ProductApi
import com.lucianww.hammersystemapp.data.source.net.product.model.ProductListNetModel
import io.reactivex.rxjava3.core.Single

class ProductNetSource (private val api: ProductApi) {

    suspend fun getProducts(category: String): ProductListNetModel{
        return api.getProductListResponse(category)
    }
}