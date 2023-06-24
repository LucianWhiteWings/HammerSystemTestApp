package com.lucianww.hammersystemapp.presentation.menu.view

import android.opengl.Visibility
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.lucianww.hammersystemapp.databinding.FragmentMenuBinding
import com.lucianww.hammersystemapp.presentation.menu.model.CategoryUIModel
import com.lucianww.hammersystemapp.presentation.menu.model.ProductUIModel
import com.lucianww.hammersystemapp.presentation.menu.viewModel.MenuViewModel
import com.lucianww.hammersystemapp.utils.MenuViewModelFactory
import retrofit2.Retrofit

class MenuFragment :
    Fragment(),
    CategoryAdapter.OnCategoryClickListener,
    ProductAdapter.OnProductClickListener {



    private val viewModel: MenuViewModel by viewModels()


    private lateinit var binding: FragmentMenuBinding

    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var productAdapter: ProductAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {



        binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root

    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()

        viewModel.getCategoriesLiveData().observe(viewLifecycleOwner) {categoryList ->

            categoryAdapter.setData(categoryList)
        }
        viewModel.getProductsLiveData().observe(viewLifecycleOwner) { productList ->
            productAdapter.setData(productList)
        }

        viewModel.getProgressBarLiveData().observe(viewLifecycleOwner) { visibility ->
//            if(visibility) binding.progressBar.visibility = View.VISIBLE
//            else
            binding.progressBar.visibility = if(visibility) View.GONE else View.VISIBLE
        }
    }

    private fun initView() {
        categoryAdapter = CategoryAdapter(this, context!!)
        binding.rvCategory.adapter = categoryAdapter

        productAdapter = ProductAdapter(this)
        binding.rvProduct.adapter = productAdapter
    }

    override fun onClick(view: View) {
        val item = view.tag as CategoryUIModel

        viewModel.loadProducts(item)
        categoryAdapter.setSelected(item)
    }

    override fun onClick(item: ProductUIModel) {

    }


}