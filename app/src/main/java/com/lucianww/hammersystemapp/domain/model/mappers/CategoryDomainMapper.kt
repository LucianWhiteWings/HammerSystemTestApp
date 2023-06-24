package com.lucianww.hammersystemapp.domain.model.mappers

import com.lucianww.hammersystemapp.domain.model.CategoryDomainModel
import com.lucianww.hammersystemapp.presentation.menu.model.CategoryUIModel

fun CategoryDomainModel.toUIModel(): CategoryUIModel =
    CategoryUIModel(id, title, imageUrl)