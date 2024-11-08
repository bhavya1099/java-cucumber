
package br.masmangan.beecrowd.bee1005;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;

public class StudentGradeSetATest {

	private StudentGrade studentGrade = new StudentGrade();

	@Test
	@Category(Categories.valid.class)
	public void setTypicalPositiveValue() {
		// Arrange
		double inputValue = 85.5;

		// Act
		studentGrade.setA(inputValue);

		// Assert
		assertEquals("Should set typical positive value", 85.5, studentGrade.a, 0.0);
	}

	@Test
	@Category(Categories.invalid.class)
	public void setNegativeValue() {
		// Arrange
		double inputValue = -45.3;

		// Act
		studentGrade.setA(inputValue);

		// Assert
		assertEquals("Should handle negative value correctly", -45.3, studentGrade.a, 0.0);
	}

	@Test
	@Category(Categories.boundary.class)
	public void setZeroValue() {
		// Arrange
		double inputValue = 0.0;

		// Act
		studentGrade.setA(inputValue);

		// Assert
		assertEquals("Should correctly set zero", 0.0, studentGrade.a, 0.0);
	}

	@Test
	@Category(Categories.boundary.class)
	public void setMaximumDoubleValue() {
		// Arrange
		double inputValue = Double.MAX_VALUE;

		// Act
		studentGrade.setA(inputValue);

		// Assert
		assertEquals("Should handle maximum double value", Double.MAX_VALUE, studentGrade.a, 0.0);
	}

}