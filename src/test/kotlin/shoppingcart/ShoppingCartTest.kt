package shoppingcart

//As a shopper, I want to know the count of items in my cart.
//As a shopper, I want to add items to my cart
//As a shopper, I want an ability to remove items from my cart.

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ShoppingCartTest {

    @Test
    fun shopping_cart_should_be_initially_empty(){
        //arrange
        val shoppingCart = ShoppingCart()

        //act
        val itemsCount = shoppingCart.getItemsCount()

        //assert
        Assertions.assertEquals(0,itemsCount)
    }

    @Test
    fun `count of items should be 1 after an item is added to empty cart`(){
        //arrange
        val shoppingCart = ShoppingCart()
        val item = Item()

        //act
        shoppingCart.add(item)

        //assert
        Assertions.assertEquals(1,shoppingCart.getItemsCount())
    }

    @Test
    fun `count of items should increment as we add items to cart`(){
        //arrange
        val shoppingCart = ShoppingCart()
        val item1 = Item()
        val item2 = Item()

        //act
        shoppingCart.add(item1)
        shoppingCart.add(item2)

        //assert
        Assertions.assertEquals(2,shoppingCart.getItemsCount())
    }

    @Test
    fun `shopping cart should include the added item`(){
        //arrange
        val shoppingCart = ShoppingCart()
        val item = Item()

        //act
        shoppingCart.add(item)

        //assert
        Assertions.assertTrue(shoppingCart.hasItem(item))
    }

    @Test
    fun `shopping cart should not include an item which was never added to it`(){
        //arrange
        val shoppingCart = ShoppingCart()
        val item = Item()

        //act


        //assert
        Assertions.assertFalse(shoppingCart.hasItem(item))
    }

    @Test
    fun `should remove an item from my cart`(){
        //arrange
        val shoppingCart = ShoppingCart()
        val item = Item()
        shoppingCart.add(item)

        //act
        shoppingCart.remove(item)

        //Assert
        Assertions.assertFalse(shoppingCart.hasItem(item))

    }
}