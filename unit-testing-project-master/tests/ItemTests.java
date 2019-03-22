import csc4700.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTests {

    @Test
    public void testJUnitIsConfiguredCorrectly() {
        assertTrue(true);
    }

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
    public void testHashCodeNull() {
        //This tests to make sure that a NullPointerException is thrown if the name of the item is null
        Item item1 = new Item();
        item1.setName(null);
        try {
            item1.hashCode();
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testHashCodeZero() {
        //This tests to make sure that an empty string is hashCoded into 0
        Item item1 = new Item();
        item1.setName("");
        assertEquals(0,item1.hashCode());
    }

    @Test
    public void testHashCodeEq(){
        //This test makes sure that two items with the same names will have the same hashCode value
        Item item1 = new Item();
        Item item2 = new Item();
        item1.setName("apple");
        item2.setName("apple");
        assertEquals(item1.hashCode(), item2.hashCode());
    }

    @Test
    public void testHashCodeNotEq(){
        //This test makes sure two differently named items will have different hashCode values
        Item item1 = new Item();
        Item item2 = new Item();
        item1.setName("apple");
        item2.setName("pencil");
        assertNotEquals(item1.hashCode(), item2.hashCode());
    }
}
