package csc4700;
import org.junit.Test;
import csc4700.Backup;

import static org.junit.Assert.*;

// Please delete this file prior to submitting your project.


public class ExampleTest {

    @Test
    public void testJUnitIsConfiguredCorrectly() {
        assertTrue(true);
    }


    //Item Tests
    @Test
    public void testDescription() {
        Item testItem = new Item();
        testItem.setDescription("Test");
        assertEquals("Test", testItem.getDescription());
    }
    @Test
    public void testCost() {
        Item testItem = new Item();
        testItem.setCost(1);
        assertEquals(1, testItem.getCost());
    }
    @Test
    public void testName() {
        Item testItem = new Item();
        testItem.setName("A");
        assertEquals("A", testItem.getName());
    }
    @Test
    public void testEqualsTrue() {
        Item itemA = new Item();
        itemA.setCost(1); itemA.setDescription("item"); itemA.setName("Test Item");
        Item itemB = itemA;
        assertEquals(true, itemA.equals(itemB));
    }
    @Test
    public void testEqualsFalse() {
        Item itemA = new Item();
        Item itemB = new Item();
        itemA.setCost(1); itemA.setDescription("item"); itemA.setName("Test Item");
        itemB.setCost(2); itemB.setDescription("itemB"); itemB.setName("Test Item 2");
        assertEquals(false, itemA.equals(itemB));
    }
    @Test
    public void testEqualsFalse2() {
        Item itemA = new Item();
        int itemB = 4;
        itemA.setCost(1); itemA.setDescription("item"); itemA.setName("Test Item");
        assertEquals(false, itemA.equals(itemB));
    }
    @Test
    public void testHashCode() {
        //Someone else is gonna have to write this test because I don't know hashcode
    }
    //End of Item Tests

    @Test
    public void testSerializeShoppingCartNull() {
        Backup b = new Backup();
        try {
            b.serializeShoppingCart(null);
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

}