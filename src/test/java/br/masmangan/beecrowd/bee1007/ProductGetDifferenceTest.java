
package br.masmangan.beecrowd.bee1007;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ProductGetDifferenceTest {

	private Product product;

	@BeforeEach
	public void setUp() {
		product = new Product();
	}

	@Test
	@Tag("boundary")
	public void testWhenAllFieldsAreZero() {
		product.setA(0);
		product.setB(0);
		product.setC(0);
		product.setD(0);
		int expectedDifference = 0;
		int actualDifference = product.getDifference();
		assertEquals(expectedDifference, actualDifference);
	}

	@Test
	@Tag("invalid")
	public void testWhenAAndBAreZero() {
		product.setA(0);
		product.setB(0);
		product.setC(1);
		product.setD(1);
		int expectedDifference = -1;
		int actualDifference = product.getDifference();
		assertEquals(expectedDifference, actualDifference);
	}

	@Test
	@Tag("valid")
	public void testWhenCAndDAreZero() {
		product.setA(1);
		product.setB(1);
		product.setC(0);
		product.setD(0);
		int expectedDifference = 1;
		int actualDifference = product.getDifference();
		assertEquals(expectedDifference, actualDifference);
	}

	@Test
	@Tag("valid")
	public void testWhenAllFieldsArePositive() {
		product.setA(2);
		product.setB(2);
		product.setC(1);
		product.setD(1);
		int expectedDifference = 2;
		int actualDifference = product.getDifference();
		assertEquals(expectedDifference, actualDifference);
	}

}