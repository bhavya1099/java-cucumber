
package br.masmangan.beecrowd.bee1007;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.experimental.categories.Category;

public class ProductSetATest {

	@Test
	@Category(Categories.valid.class)
	public void setPositiveInteger() {
		// Arrange
		Product product = new Product();

		// Act
		product.setA(5);

		// Assert
		assertEquals("Should set a positive integer", 5, product.a);
	}

	@Test
	@Category(Categories.valid.class)
	public void setNegativeInteger() {
		// Arrange
		Product product = new Product();

		// Act
		product.setA(-10);

		// Assert
		assertEquals("Should set a negative integer", -10, product.a);
	}

	@Test
	@Category(Categories.valid.class)
	public void setZero() {
		// Arrange
		Product product = new Product();

		// Act
		product.setA(0);

		// Assert
		assertEquals("Should set zero", 0, product.a);
	}

	@Test
	@Category(Categories.boundary.class)
	public void setMaxInteger() {
		// Arrange
		Product product = new Product();

		// Act
		product.setA(Integer.MAX_VALUE);

		// Assert
		assertEquals("Should set the maximum integer value", Integer.MAX_VALUE, product.a);
	}

	@Test
	@Category(Categories.boundary.class)
	public void setMinInteger() {
		// Arrange
		Product product = new Product();

		// Act
		product.setA(Integer.MIN_VALUE);

		// Assert
		assertEquals("Should set the minimum integer value", Integer.MIN_VALUE, product.a);
	}

}