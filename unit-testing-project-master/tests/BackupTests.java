import csc4700.*;
import csc4700.exceptions.SerializedFormatException;
import org.junit.Test;
import static org.junit.Assert.*;

public class BackupTests {

    @Test
    public void testSerializeShoppingCartNull() {
        //Tests the serialize shopping cart with a null
        //parameter, should throw NullPointerException
        Backup b = new Backup();
        try {
            b.serializeShoppingCart(null);
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testSerializeShoppingCart() {
        //Tests if the serializeShoppingCart serializes the shopping cart correctly
        Item testItem = new Item(); testItem.setCost(1); testItem.setDescription("testDescription"); testItem.setName("testName");
        ShoppingCart testShoppingCart = new ShoppingCart();
        testShoppingCart.addItem(testItem);
        Backup testBackup = new Backup();
        assertEquals("testName,1,testDescription,1" + System.getProperty("line.separator"), testBackup.serializeShoppingCart(testShoppingCart));
    }

    @Test
    public void testDeserializeShoppingCartNull() {
        //Tests to make sure the deserialize shopping class will throw a
        //NullPointerException if passed a null value for the String parameter
        Backup testBackup = new Backup();
        try {
            testBackup.deserializeShoppingCart(null);
        } catch (NullPointerException e) {
            assertTrue(true);
        } catch (SerializedFormatException e) {
            fail("Not the right Exception thrown");
        }
    }

    @Test
    public void testDeserializeShoppingCartFormatException() {
        //Tests the SerializedFormatException to make sure an error is thrown when
        //the string passed contains items with 4 fields
        Backup testBackup = new Backup();
        try {
            testBackup.deserializeShoppingCart("Apple,4,EatApple,2,6" + System.getProperty("line.separator") + "Pear,3,EatPear,3,Fail");
        } catch (SerializedFormatException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testDeserializeShoppingCart() {
        //Tests the deserializeShoppingCart method to test if the cart it returns
        //contains the same items as before serialization and deserialization
        Backup testBackup = new Backup();
        Item pear = new Item(); pear.setDescription("EatPear"); pear.setCost(4); pear.setName("Pear");
        Item apple = new Item(); apple.setDescription("EatApple"); apple.setCost(3); apple.setName("Apple");
        ShoppingCart testShoppingCart = new ShoppingCart();
        testShoppingCart.addItem(pear);
        testShoppingCart.addItem(apple);
        String s = testBackup.serializeShoppingCart(testShoppingCart);
        try {
            assertEquals(testShoppingCart.getCartItems(), testBackup.deserializeShoppingCart(s).getCartItems());
        } catch (SerializedFormatException e) {
            fail("Error not supposed to be thrown");
        }
    }
}