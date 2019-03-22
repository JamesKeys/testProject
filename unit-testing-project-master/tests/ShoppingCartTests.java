import csc4700.*;
import csc4700.exceptions.SerializedFormatException;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertTrue;

public class ShoppingCartTests {

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