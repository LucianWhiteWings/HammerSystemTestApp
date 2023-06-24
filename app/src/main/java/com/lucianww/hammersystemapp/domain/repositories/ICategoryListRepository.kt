package com.lucianww.hammersystemapp.domain.repositories

import com.lucianww.hammersystemapp.domain.model.CategoryDomainModel
import io.reactivex.rxjava3.core.Flowable

interface ICategoryListRepository {


    fun getCategories(): List<CategoryDomainModel>
}