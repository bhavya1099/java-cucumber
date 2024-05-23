// ********RoostGPT********
/*
Test generated by RoostGPT for test test-workflow using AI Type Azure Open AI and AI Model roostgpt-4-32k

ROOST_METHOD_HASH=getProduct_24501888ed
ROOST_METHOD_SIG_HASH=getProduct_630a0cff5b

"""
  Scenario 1: Check Product with Zero
  Details:
    TestName: testProductWithZero
    Description: This scenario tests the getProduct method by setting the value of both variables a and b as zero. The scenario checks the correctness of the multiplication operation.
  Execution:
    Arrange: The object is initialized with a and b values set as zero.
    Act: The getProduct method is invoked for the object.
    Assert: Assert that the returned result is zero.
  Validation:
    The assert statement checks if the product of a and b is zero, which is the expected behavior for any number multiplied by zero.

  Scenario 2: Validate Product with Positive Numbers
  Details:
    TestName: testProductWithPositiveNumbers
    Description: This scenario tests the getProduct method by setting the values of variables a and b as positive integers. The scenario checks the correctness of the multiplication operation.
  Execution:
    Arrange: The object is initialized with a and b values set as positive integers.
    Act: The getProduct method is invoked for the object.
    Assert: Assert that the returned result is the product of the positive numbers.
  Validation:
    The assert statement verifies if the product of a and b is as expected, confirming the correctness of the multiplication operation in normal scenarios.

  Scenario 3: Validate Product with Negative Numbers
  Details:
    TestName: testProductWithNegativeNumbers
    Description: This scenario tests the getProduct method by setting the values of variables a and b as negative integers. The scenario checks if the method correctly computes for the product of two negative numbers.
  Execution:
    Arrange: The object is initialized with a and b values set as negative integers.
    Act: The getProduct method is invoked for the object.
    Assert: Assert that the returned result is a positive integer (since the product of two negative numbers is a positive number).
  Validation:
    The assert statement validates if the product of two negative numbers yields a positive result, ensuring that the multiplication operation behaves correctly in this scenario.

  Scenario 4: Validate Product with a Positive and a Negative Number
  Details:
    TestName: testProductWithPositiveNegativeNumbers
    Description: This scenario tests the getProduct method by setting the values of variable a as a positive integer and b as a negative integer. It checks whether the method can correctly compute the product of a positive and a negative number.
  Execution:
    Arrange: The object is initialized with a set as a positive integer and b set as a negative integer.
    Act: The getProduct method is invoked for the object.
    Assert: Assert that the returned result is a negative integer (since the product of a positive and a negative number is a negative number).
  Validation:
    The assert statement validates if the product of a positive number and a negative number yields a negative result as expected, ensuring the multiplication operation accurately handles such scenarios.
"""
*/

// ********RoostGPT********
package br.masmangan.beecrowd.bee1001;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorGetProductTest {

	private Calculator calculator;

	@Before
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void testProductWithZero() {
		calculator.setA(0);
		calculator.setB(0);
		assertEquals("Product of 0 and 0 should be 0", 0, calculator.getProduct());
	}

	@Test
	public void testProductWithPositiveNumbers() {
		calculator.setA(5);
		calculator.setB(10);
		assertEquals("Product of 5 and 10 should be 50", 50, calculator.getProduct());
	}

	@Test
	public void testProductWithNegativeNumbers() {
		calculator.setA(-3);
		calculator.setB(-4);
		assertEquals("Product of -3 and -4 should be 12", 12, calculator.getProduct());
	}

	@Test
	public void testProductWithPositiveNegativeNumbers() {
		calculator.setA(6);
		calculator.setB(-2);
		assertEquals("Product of 6 and -2 should be -12", -12, calculator.getProduct());
	}

}
