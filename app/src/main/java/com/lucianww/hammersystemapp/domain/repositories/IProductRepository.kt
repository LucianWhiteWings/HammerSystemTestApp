package com.lucianww.hammersystemapp.domain.repositories

import com.lucianww.hammersystemapp.domain.model.ProductDomainModel

interface IProductRepository {

    fun getProducts(category: String): List<ProductDomainModel>
}