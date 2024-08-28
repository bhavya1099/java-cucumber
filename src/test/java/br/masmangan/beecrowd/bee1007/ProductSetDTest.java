

package br.masmangan.beecrowd.bee1007;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;

public class ProductSetDTest {
    
    @Test
    @Category(Categories.valid.class)
    public void setPositiveValueToD() {
        Product product = new Product();
        product.setA(5);
        product.setB(6);
        product.setC(7);
        product.setD(10);
        assertEquals("Check difference after setting positive D", -4, product.getDifference());
    }
    
    @Test
    @Category(Categories.valid.class)
    public void setNegativeValueToD() {
        Product product = new Product();
        product.setA(5);
        product.setB(6);
        product.setC(7);
        product.setD(-5);
        assertEquals("Check difference after setting negative D", 65, product.getDifference());
    }
    @Test
    @Category(Categories.valid.class)
    public void setZeroToD() {
        Product product = new Product();
        product.setA(5);
        product.setB(6);
        product.setC(7);
        product.setD(0);
        assertEquals("Check difference with D set to zero", 30, product.getDifference());
    }
    @Test
    @Category(Categories.boundary.class)
    public void setMaxIntegerValueToD() {
        Product product = new Product();
        product.setA(1);
        product.setB(1);
        product.setC(1);
        product.setD(Integer.MAX_VALUE);
        assertEquals("Check difference with D at max int value", -2147483646, product.getDifference());
    }
}