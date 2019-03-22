import csc4700.*;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class ShoppingCartTests {

    @Test
    public void testAddItemNull() {
        Item itemA = null;
        ShoppingCart testShoppingCart = new ShoppingCart();
        try {
            testShoppingCart.addItem(itemA);
        } catch(NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testAddItem() {
        Item testItem = new Item(); testItem.setName("testName");
        CartItem testCartItem = new CartItem(testItem);
        ShoppingCart testShoppingCart = new ShoppingCart();
        testShoppingCart.addItem(testItem);
        assertEquals(0, testShoppingCart.getCartItems().indexOf(testCartItem));
    }

    @Test
    public void testDeleteItemNull() {
        Item itemA = null;
        ShoppingCart testShoppingCart = new ShoppingCart();
        try {
            testShoppingCart.deleteItem(itemA);
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testDeleteItemNotPresent() {
        Item testItem = new Item(); testItem.setName("test");
        ShoppingCart testShoppingCart = new ShoppingCart();
        testShoppingCart.deleteItem(testItem);
        assertEquals(0, testShoppingCart.getCartItems().size());
    }

    @Test
    public void testDeleteItemSingle() {
        Item testItem = new Item(); testItem.setName("test");
        ShoppingCart testShoppingCart = new ShoppingCart();
        testShoppingCart.addItem(testItem);
        testShoppingCart.deleteItem(testItem);
        assertEquals(0, testShoppingCart.getCartItems().size());
    }

    @Test
    public void testDeleteItemMultiple() {
        Item testItem = new Item(); testItem.setName("test");
        ShoppingCart testShoppingCart = new ShoppingCart();
        testShoppingCart.addItem(testItem);
        testShoppingCart.addItem(testItem);
        testShoppingCart.deleteItem(testItem);
        assertEquals(1, testShoppingCart.findCartItem(testItem).getCount());
    }
}