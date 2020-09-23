package shoppingcart

class ShoppingCart {
    private val items = mutableListOf<Item>()

    fun getItemsCount(): Int {
        return items.count()
    }

    fun add(item: Item) {
        items.add(item)
    }

    fun hasItem(item: Item): Boolean {
        return items.contains(item)
    }

    fun remove(item: Item) {
        items.remove(item)
    }

}
