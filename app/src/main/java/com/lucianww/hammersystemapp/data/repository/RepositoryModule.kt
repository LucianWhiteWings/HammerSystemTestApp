package com.lucianww.hammersystemapp.data.repository

import com.lucianww.hammersystemapp.domain.repositories.ICategoryListRepository
import com.lucianww.hammersystemapp.domain.repositories.IProductRepository


abstract class RepositoryModule {

    abstract fun getCategoryListRepository(
        categoryListRepository: CategoryListRepository
    ): ICategoryListRepository

    abstract fun getProductListRepository(
        productListRepository: ProductListRepository
    ): IProductRepository
}