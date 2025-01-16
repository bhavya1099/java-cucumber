
package br.masmangan.beecrowd.bee1007;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ProductGetDifferenceTest {

	Product product;

	@BeforeEach
	public void setup() {
		product = new Product();
	}

	@Test
	@Tag("valid")
	public void testGetDifferenceWhenAllVariablesAreZero() {
		product.setA(0);
		product.setB(0);
		product.setC(0);
		product.setD(0);
		assertEquals(0, product.getDifference());
	}

	@Test
	@Tag("valid")
	public void testGetDifferenceWhenAllVariablesArePositive() {
		product.setA(2);
		product.setB(3);
		product.setC(1);
		product.setD(1);
		assertEquals(5, product.getDifference());
	}

	@Test
	@Tag("valid")
	public void testGetDifferenceWhenABPositiveAndCDNegative() {
		product.setA(2);
		product.setB(3);
		product.setC(-1);
		product.setD(-1);
		assertEquals(7, product.getDifference());
	}

	@Test
	@Tag("valid")
	public void testGetDifferenceWhenABNegativeAndCDPositive() {
		product.setA(-2);
		product.setB(-3);
		product.setC(1);
		product.setD(1);
		assertEquals(-5, product.getDifference());
	}

}