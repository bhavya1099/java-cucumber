
package br.masmangan.beecrowd.bee1007;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

public class ProductGetDifferenceTest {

	@Test
	@Tag("valid")
	public void testWhenAllVariablesAreZero() {
		Product product = new Product();
		product.setA(0);
		product.setB(0);
		product.setC(0);
		product.setD(0);
		int actualDifference = product.getDifference();
		assertEquals(0, actualDifference);
	}

	@Test
	@Tag("valid")
	public void testWhenAandBAreGreaterThanCandD() {
		Product product = new Product();
		product.setA(3);
		product.setB(4);
		product.setC(1);
		product.setD(2);
		int actualDifference = product.getDifference();
		assertEquals(10, actualDifference);
	}

	@Test
	@Tag("valid")
	public void testWhenCandDAreGreaterThanAandB() {
		Product product = new Product();
		product.setA(2);
		product.setB(3);
		product.setC(4);
		product.setD(5);
		int actualDifference = product.getDifference();
		assertEquals(-14, actualDifference);
	}

	@Test
	@Tag("valid")
	public void testWhenAllVariablesAreEqual() {
		Product product = new Product();
		product.setA(2);
		product.setB(2);
		product.setC(2);
		product.setD(2);
		int actualDifference = product.getDifference();
		assertEquals(0, actualDifference);
	}

	@Test
	@Tag("valid")
	public void testWhenAandBAreZeroAndCandDAreNonZero() {
		Product product = new Product();
		product.setA(0);
		product.setB(0);
		product.setC(2);
		product.setD(3);
		int actualDifference = product.getDifference();
		assertEquals(-6, actualDifference);
	}

}