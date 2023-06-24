package com.lucianww.hammersystemapp.presentation.menu.viewModel

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lucianww.hammersystemapp.data.source.net.NetSourceModule
import com.lucianww.hammersystemapp.data.source.net.category.CategoryNetSource
import com.lucianww.hammersystemapp.data.source.net.category.model.toCategoryDomainModel
import com.lucianww.hammersystemapp.data.source.net.product.ProductNetSource
import com.lucianww.hammersystemapp.data.source.net.product.model.toProductDomainModel
import com.lucianww.hammersystemapp.domain.model.mappers.toUIModel
import com.lucianww.hammersystemapp.domain.usecases.categories.GetCategoriesUseCase
import com.lucianww.hammersystemapp.presentation.menu.model.CategoryUIModel
import com.lucianww.hammersystemapp.presentation.menu.model.ProductUIModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit

class MenuViewModel :
    ViewModel() {



    private var _categoriesLiveData = MutableLiveData<List<CategoryUIModel>>()
    fun getCategoriesLiveData(): LiveData<List<CategoryUIModel>> = _categoriesLiveData

    private var _productsLiveData = MutableLiveData<List<ProductUIModel>>()
    fun getProductsLiveData(): LiveData<List<ProductUIModel>> = _productsLiveData

    private var _progressBarLiveData = MutableLiveData<Boolean>()
    fun getProgressBarLiveData(): LiveData<Boolean> = _progressBarLiveData



    init {
        _progressBarLiveData.value = true
        loadCategories()
    }

    private fun loadCategories() {

        val retrofit = NetSourceModule().getRetrofit()
        val api = NetSourceModule().getCategoryApi(retrofit)




        Log.d("TAG", "loadCategories")

        CoroutineScope(Dispatchers.IO).launch {
            val listCategoryNetModel = CategoryNetSource(api).getCategories().categoryList
            val listCategoryUIModel = listCategoryNetModel
                .map { it.toCategoryDomainModel() }
                .map { it.toUIModel() }

            _categoriesLiveData.postValue(listCategoryUIModel)
        }



    }

    fun loadProducts(item: CategoryUIModel) {

        _productsLiveData.value = mutableListOf<ProductUIModel>()

        val retrofit = NetSourceModule().getRetrofit()
        val api = NetSourceModule().getProductApi(retrofit)

        _progressBarLiveData.value = false


        CoroutineScope(Dispatchers.IO).launch {
            val listProductNetModel = ProductNetSource(api).getProducts(item.title).productList
            val listProductUIModel = listProductNetModel
                .map { it.toProductDomainModel() }
                .map { it.toUIModel() }

            _productsLiveData.postValue(listProductUIModel)
            _progressBarLiveData.postValue(true)
        }


    }




}