package com.jamesmozz11.shoppinglist.models

class ItemModel {
    var name:String? = null // The name of the Item
    var isChecked:Boolean = false // has the item been ticked off the list?

    fun ItemModel(item:String) {
        name = item
    }

    fun getItemName(): String {
        return name.toString()
    }

    fun setItemName(name:String) {
        this.name = name
    }

    fun isItemTicked():Boolean {
        return isChecked
    }

    fun tickItem() {
        isChecked = !isChecked
    }
}