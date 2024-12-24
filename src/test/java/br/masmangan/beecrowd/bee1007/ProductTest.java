package br.masmangan.beecrowd.bee1007;

import org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api;

public class ProductTest {

	@Test
	@Tag("valid")
	public void testWhenAllParametersArePositive() {
		Product product = new Product();
		product.setA(4);
		product.setB(3);
		product.setC(2);
		product.setD(1);
		int result = product.getDifference();
		assertEquals(10, result);
	}

	@Test
	@Tag("boundary")
	public void testWhenAllParametersAreZero() {
		Product product = new Product();
		product.setA(0);
		product.setB(0);
		product.setC(0);
		product.setD(0);
		int result = product.getDifference();
		assertEquals(0, result);
	}

	@Test
	@Tag("valid")
	public void testWhenParametersAreNegative() {
		Product product = new Product();
		product.setA(-2);
		product.setB(-3);
		product.setC(-1);
		product.setD(-2);
		int result = product.getDifference();
		assertEquals(0, result);
	}

	@Test
	@Tag("valid")
	public void testWhenParametersAreMixed() {
		Product product = new Product();
		product.setA(2);
		product.setB(-3);
		product.setC(1);
		product.setD(-2);
		int result = product.getDifference();
		assertEquals(-10, result);
	}

}