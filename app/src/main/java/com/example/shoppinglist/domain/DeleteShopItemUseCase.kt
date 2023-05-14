package com.example.shoppinglist.domain

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    suspend fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}