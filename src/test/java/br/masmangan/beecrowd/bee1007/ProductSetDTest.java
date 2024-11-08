
package br.masmangan.beecrowd.bee1007;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Categories.valid.class)
public class ProductSetDTest {

	private Product product;

	@Before
	public void setUp() {
		product = new Product();
	}

	@Test
	@Category(Categories.valid.class)
	public void setPositiveIntegerValue() {
		product.setD(5);
		assertEquals("Setting a positive integer value failed.", 5, product.getD());
	}

	@Test
	@Category(Categories.invalid.class)
	public void setNegativeIntegerValue() {
		product.setD(-10);
		assertEquals("Setting a negative integer value failed.", -10, product.getD());
	}

	@Test
	@Category(Categories.valid.class)
	public void setZeroValue() {
		product.setD(0);
		assertEquals("Setting zero as a value failed.", 0, product.getD());
	}

	@Test
	@Category(Categories.boundary.class)
	public void setMaximumIntBoundaryValue() {
		product.setD(Integer.MAX_VALUE);
		assertEquals("Handling maximum integer boundary value failed.", Integer.MAX_VALUE, product.getD());
	}

	@Test
	@Category(Categories.boundary.class)
	public void setMinimumIntBoundaryValue() {
		product.setD(Integer.MIN_VALUE);
		assertEquals("Handling minimum integer boundary value failed.", Integer.MIN_VALUE, product.getD());
	}

}