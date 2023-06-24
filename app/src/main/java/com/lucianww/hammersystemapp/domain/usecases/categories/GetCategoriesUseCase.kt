package com.lucianww.hammersystemapp.domain.usecases.categories

import com.lucianww.hammersystemapp.data.repository.CategoryListRepository
import com.lucianww.hammersystemapp.data.source.net.category.model.CategoryNetModel
import com.lucianww.hammersystemapp.domain.model.CategoryDomainModel
import com.lucianww.hammersystemapp.presentation.menu.model.CategoryUIModel

class GetCategoriesUseCase (private val categoryListRepository: CategoryListRepository){

//    operator fun invoke(): List<CategoryDomainModel> =
//        categoryListRepository.getCategories()
}