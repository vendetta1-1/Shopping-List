package com.vendetta.shoppinglist.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.vendetta.shoppinglist.R

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var adapter: ShopListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecyclerView()
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        viewModel.shopList.observe(this) {
            adapter.shopList = it
        }
    }

    private fun setupRecyclerView() {
        val rvShopList = findViewById<RecyclerView>(R.id.rv_shop_list)
        with(rvShopList) {
            adapter = ShopListAdapter()
            this.adapter = adapter
            recycledViewPool.setMaxRecycledViews(ShopListAdapter.VIEW_TYPE_ENABLED, ShopListAdapter.MAX_POOL_SIZE)
            recycledViewPool.setMaxRecycledViews(ShopListAdapter.VIEW_TYPE_DISABLED, ShopListAdapter.MAX_POOL_SIZE)
        }
    }
}