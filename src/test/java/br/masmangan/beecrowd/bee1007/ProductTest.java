package br.masmangan.beecrowd.bee1007;

import org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api;

public class ProductTest {

	@Test
	@Tag("valid")
	public void testPositiveParameters() {
		Product product = new Product();
		product.setA(2);
		product.setB(3);
		product.setC(1);
		product.setD(1);
		assertEquals(5, product.getDifference());
	}

	@Test
	@Tag("boundary")
	public void testZeroParameters() {
		Product product = new Product();
		product.setA(0);
		product.setB(0);
		product.setC(0);
		product.setD(0);
		assertEquals(0, product.getDifference());
	}

	@Test
	@Tag("invalid")
	public void testNegativeParameters() {
		Product product = new Product();
		product.setA(2);
		product.setB(-3);
		product.setC(1);
		product.setD(1);
		assertEquals(-5, product.getDifference());
	}

	@Test
	@Tag("valid")
	public void testAllNegativeParameters() {
		Product product = new Product();
		product.setA(-2);
		product.setB(-3);
		product.setC(-1);
		product.setD(-1);
		assertEquals(5, product.getDifference());
	}

}