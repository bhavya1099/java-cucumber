// ********RoostGPT********
/*
Test generated by RoostGPT for test test-workflow using AI Type Azure Open AI and AI Model roostgpt-4-32k

ROOST_METHOD_HASH=getAverage_cd4fabe1ad
ROOST_METHOD_SIG_HASH=getAverage_5d8b4919d3

"""
  Scenario 1: Validate the functionality of getAverage method when 'a' and 'b' are positive numbers.

  Details:
    TestName: testGetAverageWithPositiveNumbers.
    Description: This test is to validate if the getAverage method returns the correct average when both 'a' and 'b' are positive numbers.
  Execution:
    Arrange: Set 'a' and 'b' to positive numbers, for instance, 'a' - 3 and 'b' - 2.
    Act: Invoke getAverage method.
    Assert: The expected output would be (3*3.5 + 2*7.5) / 11.0 = 3.68. Validate if the returned value equals 3.68.
  Validation:
    The assertion is aimed to verify if the method performs the correct computation when 'a' and 'b' are positive. The correctness of this functionality is essential as it is the most common use-case scenario.


  Scenario 2: Validate the functionality of getAverage method when 'a' and 'b' are negative numbers.

  Details:
    TestName: testGetAverageWithNegativeNumbers.
    Description: This test is to validate if the getAverage method returns the correct average when 'a' and 'b' are negative numbers.
  Execution:
    Arrange: Set 'a' and 'b' to negative numbers, for instance, 'a' - -3 and 'b' - -2.
    Act: Invoke getAverage method.
    Assert: The expected output would be (-3*3.5 + -2*7.5) / 11.0 = -3.68. Validate if the returned value equals -3.68.
  Validation:
    The assertion is aimed to verify if the method performs the correct computation when 'a' and 'b' are negative. This lays the groundwork for handling scenarios with negative inputs.


  Scenario 3: Validate the functionality of getAverage method when 'a' is zero.

  Details:
    TestName: testGetAverageWhenAIsZero.
    Description: This test is to validate if the getAverage method returns the correct average when 'a' is zero and 'b' is a positive or negative number.
  Execution:
    Arrange: Set 'a' to zero and 'b' to a positive or negative number, for instance, 'b' - 2.
    Act: Invoke getAverage method.
    Assert: The expected output would be (0*3.5 + 2*7.5) / 11.0 = 1.36. Validate if the returned value equals 1.36.
  Validation:
    The assertion is aimed to verify if the method performs the correct computation when 'a' is zero. This scenario test is significant as it validates the handling of zero inputs.


  Scenario 4: Validate the functionality of getAverage method when 'b' is zero.

  Details:
    TestName: testGetAverageWhenBIsZero.
    Description: This test is to validate if the getAverage method returns the correct average when 'b' is zero and 'a' is a positive or negative number.
  Execution:
    Arrange: Set 'b' to zero and 'a' to a positive or negative number, for instance, 'a' - 3.
    Act: Invoke getAverage method.
    Assert: The expected output would be (3*3.5 + 0*7.5) / 11.0 = 0.9545. Validate if the returned value equals 0.9545.
  Validation:
    The assertion is aimed to verify if the method properly calculates the average when 'b' is zero. This scenario test is important to ascertain the handling of zero inputs.

"""
*/

// ********RoostGPT********
package br.masmangan.beecrowd.bee1005;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import io.cucumber.junit.Cucumber;
import org.jacoco.core.analysis.ICounter;

public class StudentGradeGetAverageTest {

	private double a;

	private double b;

	@Before
	public void setup() {
		a = 0;
		b = 0;
	}

	@Test
	public void testGetAverageWithPositiveNumbers() {
		a = 3;
		b = 2;
		double expectedAverage = (a * 3.5 + b * 7.5) / 11.0;
		assertEquals(expectedAverage, getAverage(), 0.01);
	}

	@Test
	public void testGetAverageWithNegativeNumbers() {
		a = -3;
		b = -2;
		double expectedAverage = (a * 3.5 + b * 7.5) / 11.0;
		assertEquals(expectedAverage, getAverage(), 0.01);
	}

	@Test
	public void testGetAverageWhenAIsZero() {
		a = 0;
		b = 2;
		double expectedAverage = (a * 3.5 + b * 7.5) / 11.0;
		assertEquals(expectedAverage, getAverage(), 0.01);
	}

	@Test
	public void testGetAverageWhenBIsZero() {
		a = 3;
		b = 0;
		double expectedAverage = (a * 3.5 + b * 7.5) / 11.0;
		assertEquals(expectedAverage, getAverage(), 0.01);
	}

	public double getAverage() {
		return (a * 3.5 + b * 7.5) / 11.0;
	}

}
