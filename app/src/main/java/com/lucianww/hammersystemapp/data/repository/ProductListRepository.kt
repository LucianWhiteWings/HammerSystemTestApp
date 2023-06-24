package com.lucianww.hammersystemapp.data.repository

import com.lucianww.hammersystemapp.data.source.net.product.ProductNetSource
import com.lucianww.hammersystemapp.data.source.net.product.model.toProductDomainModel
import com.lucianww.hammersystemapp.domain.model.ProductDomainModel
import com.lucianww.hammersystemapp.domain.repositories.IProductRepository

class ProductListRepository(
    private val productNetSource: ProductNetSource
)  {

//    override fun getProducts(category: String): List<ProductDomainModel> {
//        return productNetSource.getProducts(category).productList
//            .map{ it.toProductDomainModel() }
//    }

}