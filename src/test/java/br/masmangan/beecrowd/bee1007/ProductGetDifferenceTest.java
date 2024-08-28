

package br.masmangan.beecrowd.bee1007;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.experimental.categories.Category;

public class ProductGetDifferenceTest {
    
    @Test
    @Category(Categories.valid.class)
    public void testAllPositiveNumbers() {
        Product product = new Product();
        product.setA(2);
        product.setB(3);
        product.setC(1);
        product.setD(4);
        int result = product.getDifference();
        assertEquals("Result should be 2 for all positive numbers", 2, result);
    }
    @Test
    @Category(Categories.valid.class)
    public void testAllNegativeNumbers() {
        Product product = new Product();
        product.setA(-2);
        product.setB(-3);
        product.setC(-1);
        product.setD(-4);
        int result = product.getDifference();
        assertEquals("Result should be -2 for all negative numbers", -2, result);
    }
    @Test
    @Category(Categories.boundary.class)
    public void testWithZeros() {
        Product product = new Product();
        product.setA(0);
        product.setB(3);
        product.setC(0);
        product.setD(4);
        int result = product.getDifference();
        assertEquals("Result should be 0 when zeros are involved", 0, result);
    }
    @Test
    @Category(Categories.valid.class)
    public void testMixedSignValues() {
        Product product = new Product();
        product.setA(-2);
        product.setB(3);
        product.setC(1);
        product.setD(-4);
        int result = product.getDifference();
        assertEquals("Result should be 10 for mixed sign values", 10, result);
    }
    @Test
    @Category(Categories.boundary.class)
    public void testLargeValues() {
        Product product = new Product();
        product.setA(10000);
        product.setB(30000);
        product.setC(10000);
        product.setD(40000);
        int result = product.getDifference();
        assertEquals("Result should be -1000000000 for large values", -1000000000, result);
    }
}