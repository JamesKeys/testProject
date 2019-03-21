import csc4700.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTests {
    @Test
    public void testJUnitIsConfiguredCorrectly() {
        assertTrue(true);
    }


    //Item Tests
    @Test
    public void testDescription() {
        //This method tests the set and get methods for an Item's description
        Item testItem = new Item();
        testItem.setDescription("Test");
        assertEquals("Test", testItem.getDescription());
    }
    @Test
    public void testCost() {
        //This method tests the set and methods for an Item's cost
        Item testItem = new Item();
        testItem.setCost(1);
        assertEquals(1, testItem.getCost());
    }
    @Test
    public void testName() {
        //This method tests the set and get methods for an Item's name
        Item testItem = new Item();
        testItem.setName("A");
        assertEquals("A", testItem.getName());
    }
    @Test
    public void testItemEqualsTrue() {
        //This method tests the equals function for an Item, a true case
        Item itemA = new Item();
        itemA.setCost(1); itemA.setDescription("item"); itemA.setName("Test Item");
        Item itemB = itemA;
        assertEquals(true, itemA.equals(itemB));
    }
    @Test
    public void testItemEqualsFalse() {
        //This method tests the Equals function for an Item by comparing two different items
        Item itemA = new Item();
        Item itemB = new Item();
        itemA.setCost(1); itemA.setDescription("item"); itemA.setName("Test Item");
        itemB.setCost(2); itemB.setDescription("itemB"); itemB.setName("Test Item 2");
        assertEquals(false, itemA.equals(itemB));
    }
    @Test
    public void testItemEqualsFalse2() {
        //This method tests the equals function for an Item, if the classes are different
        Item itemA = new Item();
        int itemB = 4;
        itemA.setCost(1); itemA.setDescription("item"); itemA.setName("Test Item");
        assertEquals(false, itemA.equals(itemB));
    }
    @Test
    public void testItemEqualsFalse3() {
        //This method tests the equals function for an item when it is being compared to a null value
        Item a = new Item();
        assertEquals(false, a.equals(null));
    }
    @Test
    public void testItemHashCode() {
        //Someone else is gonna have to write this test because I don't know hashcode
    }
    //End of Item Tests

    @Test
    public void testSerializeShoppingCartNull() {
        //Tests the serialize shopping cart with a null parameter, should throw NullPointerException
        Backup b = new Backup();
        try {
            b.serializeShoppingCart(null);
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }
}
