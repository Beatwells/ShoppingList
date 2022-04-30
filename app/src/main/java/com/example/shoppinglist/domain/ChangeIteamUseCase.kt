package com.example.shoppinglist.domain

class ChangeIteamUseCase(private val shopListRepository: ShopListRepository){
    fun changeShopItem(shopItem: ShopItem){
        shopListRepository.changeShopItem(shopItem)
    }
}