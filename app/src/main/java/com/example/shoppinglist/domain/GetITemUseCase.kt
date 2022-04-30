package com.example.shoppinglist.domain

class GetITemUseCase (private  val shopListRepository: ShopListRepository){
    fun getShopItem(shopItemID: Int): ShopItem{
        return shopListRepository.getShopItem()
    }
}