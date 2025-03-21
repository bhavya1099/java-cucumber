
package br.masmangan.beecrowd.bee1005;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class StudentGradeGetAverageTest {

	@Test
	@Tag("valid")
	public void testValidAveragePositiveNumbers() {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(3.0);
		studentGrade.setB(7.0);
		double expectedAverage = (3.0 * 3.5 + 7.0 * 7.5) / 11.0;
		Assertions.assertEquals(expectedAverage, studentGrade.getAverage());
	}

	@Test
	@Tag("valid")
	public void testValidAverageNegativeNumbers() {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(-3.0);
		studentGrade.setB(-7.0);
		double expectedAverage = (-3.0 * 3.5 - 7.0 * 7.5) / 11.0;
		Assertions.assertEquals(expectedAverage, studentGrade.getAverage());
	}

	@Test
	@Tag("valid")
	public void testValidAverageWithZero() {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(3.0);
		studentGrade.setB(0.0);
		double expectedAverage = (3.0 * 3.5 + 0.0 * 7.5) / 11.0;
		Assertions.assertEquals(expectedAverage, studentGrade.getAverage());
	}

	@Test
	@Tag("boundary")
	public void testValidAverageMaxDoubleValues() {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(Double.MAX_VALUE);
		studentGrade.setB(Double.MAX_VALUE);
		double expectedAverage = (Double.MAX_VALUE * 3.5 + Double.MAX_VALUE * 7.5) / 11.0;
		Assertions.assertEquals(expectedAverage, studentGrade.getAverage());
	}

}