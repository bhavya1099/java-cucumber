// ********RoostGPT********
/*
Test generated by RoostGPT for test java-customannotation-test using AI Type  and AI Model

ROOST_METHOD_HASH=getDifference_8e14ab318e
ROOST_METHOD_SIG_HASH=getDifference_0b169691c7

```plaintext
Scenario 1: Test with all positive numbers
Details:
  TestName: testAllPositiveNumbers
  Description: Validates the getDifference method when all input values (a, b, c, d) are positive.
Execution:
  Arrange: Set a = 2, b = 3, c = 1, d = 4.
  Act: Call the getDifference method.
  Assert: Assert that the result is 2 (as 2*3 - 1*4 = 6 - 4).
Validation:
  Clarify that the assertion checks for the correct computation of the method under positive number conditions.
  The significance of this test is to confirm correct behavior when all inputs are positive, which is a common case in numerical operations.

Scenario 2: Test with all negative numbers
Details:
  TestName: testAllNegativeNumbers
  Description: Validates the getDifference method when all input values (a, b, c, d) are negative.
Execution:
  Arrange: Set a = -2, b = -3, c = -1, d = -4.
  Act: Call the getDifference method.
  Assert: Assert that the result is -2 (as -2*-3 - -1*-4 = 6 - 4).
Validation:
  Clarify that the assertion checks for the correct computation of the method under negative number conditions.
  It's important to test negative values to ensure that multiplication and subtraction are handled correctly with negative inputs.

Scenario 3: Test with zeros
Details:
  TestName: testWithZeros
  Description: Validates the getDifference method when some input values are zero.
Execution:
  Arrange: Set a = 0, b = 3, c = 0, d = 4.
  Act: Call the getDifference method.
  Assert: Assert that the result is -0 (as 0*3 - 0*4 = 0 - 0).
Validation:
  Clarify that the assertion verifies the method handles zero values correctly, ensuring no erroneous behavior in multiplication or subtraction.
  Testing with zeros is crucial as it can be a common edge case in mathematical computations.

Scenario 4: Test with mixed sign values
Details:
  TestName: testMixedSignValues
  Description: Checks the getDifference method when input values have mixed signs.
Execution:
  Arrange: Set a = -2, b = 3, c = 1, d = -4.
  Act: Call the getDifference method.
  Assert: Assert that the result is 10 (as -2*3 - 1*-4 = -6 + 4).
Validation:
  Clarify that the assertion ensures proper handling of mixed sign multiplication and subtraction.
  This test is significant for verifying that the method behaves correctly under mixed sign conditions, which can be a realistic scenario in numerical operations.

Scenario 5: Test with large values
Details:
  TestName: testLargeValues
  Description: Validates the getDifference method when input values are very large to check for any overflow issues.
Execution:
  Arrange: Set a = 10000, b = 30000, c = 10000, d = 40000.
  Act: Call the getDifference method.
  Assert: Assert that the result is -1000000000 (as 10000*30000 - 10000*40000 = 300000000 - 400000000).
Validation:
  Clarify that the assertion checks for correct computation without overflow.
  This test is important to ensure that the method can handle large values without computational errors, which is crucial for applications dealing with high range numerical data.
```
*/

// ********RoostGPT********

package br.masmangan.beecrowd.bee1007;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.assertEquals;

public class ProductGetDifferenceTest {

	@Test
	@Category(Categories.valid.class)
	public void testAllPositiveNumbers() {
		Product product = new Product();
		product.setA(2);
		product.setB(3);
		product.setC(1);
		product.setD(4);
		int expected = 2;
		assertEquals(expected, product.getDifference());
	}

	@Test
	@Category(Categories.valid.class)
	public void testAllNegativeNumbers() {
		Product product = new Product();
		product.setA(-2);
		product.setB(-3);
		product.setC(-1);
		product.setD(-4);
		int expected = -2;
		assertEquals(expected, product.getDifference());
	}

	@Test
	@Category(Categories.boundary.class)
	public void testWithZeros() {
		Product product = new Product();
		product.setA(0);
		product.setB(3);
		product.setC(0);
		product.setD(4);
		int expected = 0;
		assertEquals(expected, product.getDifference());
	}

	@Test
	@Category(Categories.valid.class)
	public void testMixedSignValues() {
		Product product = new Product();
		product.setA(-2);
		product.setB(3);
		product.setC(1);
		product.setD(-4);
		int expected = 10;
		assertEquals(expected, product.getDifference());
	}

	@Test
	@Category(Categories.boundary.class)
	public void testLargeValues() {
		Product product = new Product();
		product.setA(10000);
		product.setB(30000);
		product.setC(10000);
		product.setD(40000);
		int expected = -1000000000;
		assertEquals(expected, product.getDifference());
	}

}