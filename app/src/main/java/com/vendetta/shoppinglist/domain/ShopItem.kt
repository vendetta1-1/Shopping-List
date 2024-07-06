package com.vendetta.shoppinglist.domain

import androidx.room.PrimaryKey

data class ShopItem(
    @PrimaryKey
    val id: UInt,
    val name: String,
    val count: Int,
    val isActive: Boolean
)
