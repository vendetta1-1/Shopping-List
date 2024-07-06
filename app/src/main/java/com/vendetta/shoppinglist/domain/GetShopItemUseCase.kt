package com.vendetta.shoppinglist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: UInt): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }

}