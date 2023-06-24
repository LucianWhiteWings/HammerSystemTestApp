package com.lucianww.hammersystemapp.data.source.net.api

import com.lucianww.hammersystemapp.data.source.net.category.model.CategoryListNetModel
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface CategoryApi {

    @GET("categories.php")
    suspend fun getCategoriesListResponse(): CategoryListNetModel
}