package com.vendetta.shoppinglist.presenatation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vendetta.shoppinglist.data.ShopListRepositoryImpl
import com.vendetta.shoppinglist.domain.DeleteShopItemUseCase
import com.vendetta.shoppinglist.domain.EditShopItemUseCase
import com.vendetta.shoppinglist.domain.GetShopListUseCase
import com.vendetta.shoppinglist.domain.ShopItem

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)

    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)

    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem){
        deleteShopItemUseCase.deleteShopItem(shopItem)

    }

    fun changeEnableState(shopItem: ShopItem){
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)

    }
}