package com.lucianww.hammersystemapp.data.repository

import com.lucianww.hammersystemapp.data.source.net.category.CategoryNetSource
import com.lucianww.hammersystemapp.data.source.net.category.model.toCategoryDomainModel
import com.lucianww.hammersystemapp.domain.model.CategoryDomainModel
import com.lucianww.hammersystemapp.domain.repositories.ICategoryListRepository


class CategoryListRepository (
    private val categoryNetSource: CategoryNetSource
)  {


//    override fun getCategories(): List<CategoryDomainModel> {
//         return categoryNetSource.getCategories().categoryList
//             .map { it.toCategoryDomainModel() }
//
//    }
}