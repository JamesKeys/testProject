import csc4700.*;
import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class CartItemTests {
    @Test
    public void testConstructor() {
        //This method tests the parameterized constructor for a CartItem, as well as the getItem method
        Item a = new Item(); a.setCost(2); a.setDescription("DescA"); a.setName("a");
        CartItem testCartItem = new CartItem(a);
        assertEquals(a, testCartItem.getItem());
    }
    @Test
    public void testCount() {
        //This method tests the set and get methods for a CartItem's count
        CartItem testCartItem = new CartItem(new Item());
        testCartItem.setCount(4);
        assertEquals(4, testCartItem.getCount());
    }
    @Test
    public void testItem() {
        //This method tests the set and get methods for a CartItem's item parameter
        CartItem testCartItem = new CartItem(new Item());
        Item a = new Item(); a.setName("testA"); a.setDescription("DescA"); a.setCost(5);
        testCartItem.setItem(a);
        assertEquals(a, testCartItem.getItem());
    }
    @Test
    public void testIncrementCountByOne() {
        //This method tests the Increment method for a CartItem
        CartItem testCartItem = new CartItem(new Item());
        testCartItem.incrementCountByOne();
        assertEquals(1,testCartItem.getCount());
    }
    @Test
    public void testDecrementCountByOne() {
        //This method tests the decrement method for a CartItem
        CartItem testCartItem = new CartItem(new Item());
        testCartItem.decrementCountByOne();
        assertEquals(-1, testCartItem.getCount());
    }
    @Test
    public void testCartItemEqualsTrue() {
        //This method tests the equals function for a CartItem with identical items
        Item a = new Item();
        CartItem testCartItem = new CartItem(a);
        CartItem testCartItemB = testCartItem;
        assertEquals(true, testCartItem.equals(testCartItemB));
    }
    @Test
    public void testCartItemEqualsTrue2() {
        //This method tests the equals function for the CartItem which has the same Item as another CartItem
        Item a = new Item(); a.setName("a"); a.setDescription("DescA"); a.setCost(1);
        Item b = new Item(); b.setName("a"); b.setDescription("DescA"); b.setCost(1);
        CartItem testCartItemA = new CartItem(a);
        CartItem testCartItemB = new CartItem(b);
        assertEquals(true, testCartItemA.equals(testCartItemB));
    }
    @Test
    public void testCartItemEqualsFalse() {
        //This method tests the equals method for a CartItem with two different items
        Item a = new Item(); Item b = new Item(); b.setName("b");
        CartItem testCartItem = new CartItem(a);
        CartItem testCartItemB = new CartItem(b);
        assertEquals(false, testCartItem.equals(testCartItemB));
    }
    @Test
    public void testCartItemEqualsFalse2() {
        //This method tests the equals method for a CartItem with a null value
        Item a = new Item();
        CartItem testCartItem = new CartItem(a);
        assertEquals(false, testCartItem.equals(null));
    }
    @Test
    public void testCartItemEqualsFalse3() {
        //This method tests the equals method for a CartItem with a parameter of a different class
        Item a = new Item();
        CartItem testCartItem = new CartItem(a);
        int b = 2;
        assertEquals(false, testCartItem.equals(b));
    }
    @Test
    public void testCartItemHashCode() {
        //Someone else has to do this, I don't know hashcode
    }
}