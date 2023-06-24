package com.lucianww.hammersystemapp.utils

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.lucianww.hammersystemapp.presentation.menu.viewModel.MenuViewModel
import retrofit2.Retrofit

class MenuViewModelFactory (

): ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val viewModel = when(modelClass) {
            MenuViewModel::class.java -> {
                MenuViewModel()
            }
            else -> throw IllegalStateException("Unknown view model class")
        }
        return viewModel as T
    }
}