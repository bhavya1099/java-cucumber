// ********RoostGPT********
/*
Test generated by RoostGPT for test test-workflow using AI Type Azure Open AI and AI Model roostgpt-4-32k

ROOST_METHOD_HASH=getAverage_cd4fabe1ad
ROOST_METHOD_SIG_HASH=getAverage_5d8b4919d3

"""
Scenario 1: Test when both a and b are zero

Details:
  TestName: testAverageWithZeroValues
  Description: This test is meant to check the method's functionality when both a and b are zero.
Execution:
  Arrange: Initialize a and b as zero.
  Act: Invoke getAverage method.
  Assert: Assert that the returned value is zero.
Validation:
  The assertion aims to verify if the logic is capable of managing corner cases, like zero division.
  The expected result of zero corroborates with the arithmetic logic of the method.

Scenario 2: Test when a is zero and b has a value

Details:
  TestName: testAverageWithOnlyBValue
  Description: This test evaluates the function with a non-zero b and a zero a.
Execution:
  Arrange: Initialize a to zero and b to a non-zero value, say 4.
  Act: Invoke getAverage method.
  Assert: Assert that the returned value is 2.72.
Validation:
  The assertion intends to confirm if the formula logic adjusts appropriately to this particular condition.
  The expected result is directly influenced by the fact that a contributes nothing due to being zero.

Scenario 3: Test when a has a value and b is zero

Details:
  TestName: testAverageWithOnlyAValue
  Description: This test evaluates the function with a non-zero a and a zero b.
Execution:
  Arrange: Initialize b to zero and a to a non-zero value, say 7.
  Act: Invoke getAverage method.
  Assert: Assert that the returned value is 2.23.
Validation:
  The aim of this test is to validate if the code correctly computes the desired output when only a holds a value and b is zero.
  The test's importance is highlighted as it checks whether weightage for b is applied correctly.


Scenario 4: Test when a and b have same values

Details:
  TestName: testAverageWithSameABValues
  Description: This test examines the behavior of the method when a and b have the same non-zero values, say 5.
Execution:
  Arrange: Initialize a and b each to 5.
  Act: Invoke getAverage method.
  Assert: Assert that the returned value is 5.68.
Validation:
  The test confirms if the code accounts for the differing weights of the inputs when their values are identical,
  demonstrating the effectiveness of the method.
  The expected result of 5.68 reinforces that b’s weightage is appropriately greater than a’s in calculating the average.

Scenario 5: Test when a is negative and b is positive

Details:
  TestName: testAverageWithNegativeAPositiveB
  Description: This test looks at the method's performance with a negative number for a and a positive number for b.
Execution:
  Arrange: Initialize a to -3 and b to 8.
  Act: Invoke getAverage method.
  Assert: Assert that the returned value 5.02.
Validation:
  This test aims to verify if the method can handle situations where one parameter is negative and the other is positive,
  an important aspect to consider in real-world applications.
  It is expected to return 5.02 since the contribution of both a and b, despite a being negative, leads to a positive result due to b's larger weight.


NOTE: The above test scenarios are not exhaustive and additional tests could be created based on further constraints and requirements.
"""
*/

// ********RoostGPT********
package br.masmangan.beecrowd.bee1005;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentGradeGetAverageTest {

	@Test
	public void testAverageWithZeroValues() {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(0.0);
		studentGrade.setB(0.0);
		double average = studentGrade.getAverage();
		assertEquals(0.0, average, 0.001);
	}

	@Test
	public void testAverageWithOnlyBValue() {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(0.0);
		studentGrade.setB(4.0);
		double average = studentGrade.getAverage();
		assertEquals(2.72, average, 0.001);
	}

	@Test
	public void testAverageWithOnlyAValue() {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(7.0);
		studentGrade.setB(0.0);
		double average = studentGrade.getAverage();
		assertEquals(2.23, average, 0.001);
	}

	@Test
	public void testAverageWithSameABValues() {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(5.0);
		studentGrade.setB(5.0);
		double average = studentGrade.getAverage();
		assertEquals(5.68, average, 0.001);
	}

	@Test
	public void testAverageWithNegativeAPositiveB() {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(-3.0);
		studentGrade.setB(8.0);
		double average = studentGrade.getAverage();
		assertEquals(5.02, average, 0.001);
	}

}
