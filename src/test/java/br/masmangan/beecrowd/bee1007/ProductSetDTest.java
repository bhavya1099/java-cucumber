

public class ProductSetDTest {

    Product product;

    @Before
    public void setup() {
        // We assume that the "Product" class is defined correctly somewhere.
        product = new Product();
    }

    @Test
    public void testSetDWithPositiveInteger() {
        // Act
        // Assuming setter method "setD" exists in the "Product" class.
        product.setD(5);
        // Assert
        // Assuming getter method "getD" exists in the "Product" class.
        assertEquals(5, product.getD());
    }

    @Test
    public void testSetDWithNegativeInteger() {
        // Act
        product.setD(-5);
        // Assert
        assertEquals(-5, product.getD());
    }

    @Test
    public void testSetDWithZero() {
        // Act
        product.setD(0);
        // Assert
        assertEquals(0, product.getD());
    }

    @Test
    public void testSetDWithMaxInteger() {
        // Act
        product.setD(Integer.MAX_VALUE);
        // Assert
        assertEquals(Integer.MAX_VALUE, product.getD());
    }

    @Test
    public void testSetDWithMinInteger() {
        // Act
        product.setD(Integer.MIN_VALUE);
        // Assert
        assertEquals(Integer.MIN_VALUE, product.getD());
    }

}
