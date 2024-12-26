package br.masmangan.beecrowd.bee1005;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api;

public class StudentGradeTest {

	@Test
	@Tag("valid")
	public void testPositiveAverageScenario() {
		// Arrange
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(4.0);
		studentGrade.setB(6.0);
		// Act
		double average = studentGrade.getAverage();
		// Assert
		assertEquals(5.45, average, 0.01);
	}

	@Test
	@Tag("valid")
	public void testNegativeAverageScenario() {
		// Arrange
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(-4.0);
		studentGrade.setB(-6.0);
		// Act
		double average = studentGrade.getAverage();
		// Assert
		assertEquals(-5.45, average, 0.01);
	}

	@Test
	@Tag("boundary")
	public void testZeroAverageScenario() {
		// Arrange
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(0.0);
		studentGrade.setB(0.0);
		// Act
		double average = studentGrade.getAverage();
		// Assert
		assertEquals(0.0, average, 0.01);
	}

	@Test
	@Tag("valid")
	public void testMixedSignInputsScenario() {
		// Arrange
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(4.0);
		studentGrade.setB(-6.0);
		// Act
		double average = studentGrade.getAverage();
		// Assert
		assertEquals(-3.18, average, 0.01);
	}

}