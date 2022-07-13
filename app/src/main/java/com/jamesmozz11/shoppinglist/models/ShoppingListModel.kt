package com.jamesmozz11.shoppinglist.models

class ShoppingListModel {
    var itemList:ArrayList<ItemModel> = ArrayList<ItemModel>()

    fun addItem(item:ItemModel) {
        itemList.add(item)
    }

    fun removeItem(item:ItemModel) {
        itemList.remove(item)
    }

    fun getItems(): ArrayList<ItemModel> {
        return itemList
    }
}
