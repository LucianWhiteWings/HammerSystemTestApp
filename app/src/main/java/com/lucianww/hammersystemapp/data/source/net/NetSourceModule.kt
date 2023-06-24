package com.lucianww.hammersystemapp.data.source.net

import com.lucianww.hammersystemapp.data.source.net.api.CategoryApi
import com.lucianww.hammersystemapp.data.source.net.api.ProductApi
import com.lucianww.hammersystemapp.data.source.net.category.CategoryNetSource
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

const val HOST = "https://www.themealdb.com/api/json/v1/1/"

class NetSourceModule {

    fun getRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl(HOST)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .build()

    fun getCategoryApi(retrofit: Retrofit): CategoryApi = retrofit.create(CategoryApi::class.java)
    fun getCategoryNetSource(categoryApi: CategoryApi) = CategoryNetSource(categoryApi)

    fun getProductApi(retrofit: Retrofit): ProductApi = retrofit.create(ProductApi::class.java)



}