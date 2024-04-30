package com.example.shoppinglist.domain

interface ShopListRepository {

    fun getShopList() : List<ShopItem>

    fun getShopItem(ShopItemID: Int) : ShopItem

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)
}