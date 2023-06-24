package com.lucianww.hammersystemapp.data.source.net.category

import com.lucianww.hammersystemapp.data.source.net.api.CategoryApi
import com.lucianww.hammersystemapp.data.source.net.category.model.CategoryListNetModel
import io.reactivex.rxjava3.core.Single

class CategoryNetSource (private val api: CategoryApi) {

    suspend fun getCategories(): CategoryListNetModel{
        return api.getCategoriesListResponse()
    }
}