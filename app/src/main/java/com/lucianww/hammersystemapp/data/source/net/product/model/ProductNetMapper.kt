package com.lucianww.hammersystemapp.data.source.net.product.model

import com.lucianww.hammersystemapp.domain.model.ProductDomainModel

fun ProductNetModel.toProductDomainModel(): ProductDomainModel =
    ProductDomainModel(id, title, thumb)