
package br.masmangan.beecrowd.bee1007;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;

public class ProductSetBTest {

	@Test
	@Category(Categories.valid.class)
	public void setPositiveInteger() {
		Product product = new Product();
		product.setB(5);
		assertEquals("Failed to set a positive integer", 5, product.b); // Assuming
																		// there's a way
																		// to check `b`
	}

	@Test
	@Category(Categories.valid.class)
	public void setNegativeInteger() {
		Product product = new Product();
		product.setB(-10);
		assertEquals("Failed to set a negative integer", -10, product.b); // Assuming
																			// there's a
																			// way to
																			// check `b`
	}

	@Test
	@Category(Categories.valid.class)
	public void setZeroValue() {
		Product product = new Product();
		product.setB(0);
		assertEquals("Failed to set zero", 0, product.b); // Assuming there's a way to
															// check `b`
	}

	@Test
	@Category(Categories.boundary.class)
	public void setMaxInteger() {
		Product product = new Product();
		product.setB(Integer.MAX_VALUE);
		assertEquals("Failed to set maximum integer", Integer.MAX_VALUE, product.b); // Assuming
																						// there's
																						// a
																						// way
																						// to
																						// check
																						// `b`
	}

	@Test
	@Category(Categories.boundary.class)
	public void setMinInteger() {
		Product product = new Product();
		product.setB(Integer.MIN_VALUE);
		assertEquals("Failed to set minimum integer", Integer.MIN_VALUE, product.b); // Assuming
																						// there's
																						// a
																						// way
																						// to
																						// check
																						// `b`
	}

	@Test(expected = NullPointerException.class)
	@Category(Categories.invalid.class)
	public void setWithoutInstantiation() {
		Product product = null;
		product.setB(10); // This should throw NullPointerException
	}

}