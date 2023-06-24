package com.lucianww.hammersystemapp.data.source.net.category.model

import com.lucianww.hammersystemapp.domain.model.CategoryDomainModel


fun CategoryNetModel.toCategoryDomainModel(): CategoryDomainModel =
    CategoryDomainModel(id, title, thumb)