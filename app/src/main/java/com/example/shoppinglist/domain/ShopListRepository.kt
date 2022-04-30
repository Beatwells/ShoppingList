package com.example.shoppinglist.domain

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun changeShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemID: Int): ShopItem

    fun getShopList(): List<ShopItem>

}