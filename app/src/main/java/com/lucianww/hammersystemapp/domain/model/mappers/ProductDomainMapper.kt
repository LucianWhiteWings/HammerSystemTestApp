package com.lucianww.hammersystemapp.domain.model.mappers

import com.github.javafaker.Faker
import com.lucianww.hammersystemapp.domain.model.ProductDomainModel
import com.lucianww.hammersystemapp.presentation.menu.model.ProductUIModel
import java.util.Random

fun ProductDomainModel.toUIModel(): ProductUIModel {

    val price = (Random().nextInt(200) + 20) * 10

    val desc = Faker.instance().food().ingredient()

    return ProductUIModel(id, title, imageUrl, desc, price)
}