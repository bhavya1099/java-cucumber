
// ********RoostGPT********
/*
Test generated by RoostGPT for test java-unit-test using AI Type  and AI Model

ROOST_METHOD_HASH=getDifference_8e14ab318e
ROOST_METHOD_SIG_HASH=getDifference_0b169691c7

Scenario 1: Test when all inputs are positive integers
Details:
  TestName: testPositiveIntegerInputs
  Description: This test is meant to check if the method getDifference() returns the correct difference when all inputs are positive integers.
  Execution:
    Arrange: Create a Product object. Set a = 2, b = 3, c = 1, d = 2.
    Act: Invoke getDifference().
    Assert: Expect the result to be 4.
  Validation:
    The assertion verifies that the method correctly calculates the difference (a*b - c*d). This test ensures that the method works correctly with positive integer inputs.

Scenario 2: Test when all inputs are zero
Details:
  TestName: testZeroInputs
  Description: This test is meant to check if the method getDifference() returns 0 when all inputs are zero.
  Execution:
    Arrange: Create a Product object. Set a = 0, b = 0, c = 0, d = 0.
    Act: Invoke getDifference().
    Assert: Expect the result to be 0.
  Validation:
    The assertion verifies that the method correctly returns 0 when all inputs are zero. This test ensures that the method works correctly with zero inputs.

Scenario 3: Test when inputs are negative integers
Details:
  TestName: testNegativeIntegerInputs
  Description: This test is meant to check if the method getDifference() returns the correct difference when all inputs are negative integers.
  Execution:
    Arrange: Create a Product object. Set a = -2, b = -3, c = -1, d = -2.
    Act: Invoke getDifference().
    Assert: Expect the result to be 0.
  Validation:
    The assertion verifies that the method correctly calculates the difference (a*b - c*d) when inputs are negative integers. This test ensures that the method works correctly with negative integer inputs.

Scenario 4: Test when inputs are a mix of positive and negative integers
Details:
  TestName: testMixedIntegerInputs
  Description: This test is meant to check if the method getDifference() returns the correct difference when inputs are a mix of positive and negative integers.
  Execution:
    Arrange: Create a Product object. Set a = 2, b = -3, c = -1, d = 2.
    Act: Invoke getDifference().
    Assert: Expect the result to be -6.
  Validation:
    The assertion verifies that the method correctly calculates the difference (a*b - c*d) when inputs are a mix of positive and negative integers. This test ensures that the method works correctly with mixed integer inputs.
*/

// ********RoostGPT********

package br.masmangan.beecrowd.bee1007;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.assertEquals;

public class ProductGetDifferenceTest {

	@Test
	@Category(Categories.valid.class)
	public void testPositiveIntegerInputs() {
		Product product = new Product();
		product.setA(2);
		product.setB(3);
		product.setC(1);
		product.setD(2);
		int expectedDifference = 4;
		assertEquals(expectedDifference, product.getDifference());
	}

	@Test
	@Category(Categories.valid.class)
	public void testZeroInputs() {
		Product product = new Product();
		product.setA(0);
		product.setB(0);
		product.setC(0);
		product.setD(0);
		int expectedDifference = 0;
		assertEquals(expectedDifference, product.getDifference());
	}

	@Test
	@Category(Categories.valid.class)
	public void testNegativeIntegerInputs() {
		Product product = new Product();
		product.setA(-2);
		product.setB(-3);
		product.setC(-1);
		product.setD(-2);
		int expectedDifference = 0;
		assertEquals(expectedDifference, product.getDifference());
	}

	@Test
	@Category(Categories.valid.class)
	public void testMixedIntegerInputs() {
		Product product = new Product();
		product.setA(2);
		product.setB(-3);
		product.setC(-1);
		product.setD(2);
		int expectedDifference = -6;
		assertEquals(expectedDifference, product.getDifference());
	}

}