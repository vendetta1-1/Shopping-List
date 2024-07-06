package com.vendetta.shoppinglist.domain

interface ShopListRepository {

    fun getShopList(): List<ShopItem>

    fun deleteShopItem(shopItem: ShopItem)

    fun addShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: UInt): ShopItem
}