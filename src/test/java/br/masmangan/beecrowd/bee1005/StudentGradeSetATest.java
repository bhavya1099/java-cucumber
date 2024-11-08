
package br.masmangan.beecrowd.bee1005;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class StudentGradeSetATest {

	private StudentGrade studentGrade;

	@Before
	public void setUp() {
		studentGrade = new StudentGrade();
	}

	@Test
	@Category(Categories.valid.class)
	public void setValidDoubleValue() {
		double expected = 85.5;
		studentGrade.setA(expected);
		double actual = studentGrade.getA(); // TODO: Replace getA() with reflective
												// access if method not available
		assertEquals("Value should be set to 85.5", expected, actual, 0.0);
	}

	@Test
	@Category(Categories.boundary.class)
	public void setZeroAsValue() {
		studentGrade.setA(0.0);
		double actual = studentGrade.getA(); // TODO: Replace getA() with reflective
												// access if method not available
		assertEquals("Value should be set to 0.0", 0.0, actual, 0.0);
	}

	@Test
	@Category(Categories.invalid.class)
	public void setNegativeValue() {
		double expected = -1.0;
		studentGrade.setA(expected);
		double actual = studentGrade.getA(); // TODO: Replace getA() with reflective
												// access if method not available
		assertEquals("Value should be set to -1.0", expected, actual, 0.0);
	}

	@Test
	@Category(Categories.boundary.class)
	public void setVeryLargeValue() {
		double expected = 1e308;
		studentGrade.setA(expected);
		double actual = studentGrade.getA(); // TODO: Replace getA() with reflective
												// access if method not available
		assertEquals("Value should handle very large floating-point numbers", expected, actual, 0.0);
	}

}