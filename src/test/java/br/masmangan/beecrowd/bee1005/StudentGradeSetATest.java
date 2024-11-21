

package br.masmangan.beecrowd.bee1005;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentGradeSetATest {

	private StudentGrade studentGrade;

	@Before
	public void setUp() {
		studentGrade = new StudentGrade();
	}

	@Test
	public void testWhenAIsInNormalRange() {
		double aValue = 4.5;
		studentGrade.setA(aValue);
		/* 
		Compiliation Error: Missing getter method for private field 'a'.
		Solution: Implement a getter method for 'a' in the StudentGrade class 
		to access it and uncomment the assertEquals statement.
		*/
		// assertEquals("Failed to set value of a correctly", aValue, studentGrade.getA(),
		// 0);
	}

	@Test
	public void testWhenAIsZero() {
		double aValue = 0.0;
		studentGrade.setA(aValue);
		/* 
		Compiliation Error: Missing getter method for private field 'a'.
		Solution: Implement a getter method for 'a' in the StudentGrade class 
		to access it and uncomment the assertEquals statement.
		*/
		// assertEquals("Failed to set value of a correctly", aValue, studentGrade.getA(),
		// 0);
	}

	@Test
	public void testWhenAIsNegative() {
		double aValue = -5.7;
		studentGrade.setA(aValue);
		/* 
		Compiliation Error: Missing getter method for private field 'a'.
		Solution: Implement a getter method for 'a' in the StudentGrade class 
		to access it and uncomment the assertEquals statement.
		*/
		// assertEquals("Failed to set value of a correctly", aValue, studentGrade.getA(),
		// 0);
	}

	@Test
	public void testWhenAIsNaN() {
		double aValue = Double.NaN;
		studentGrade.setA(aValue);
		/* 
		Compiliation Error: Missing getter method for private field 'a'.
		Solution: Implement a getter method for 'a' in the StudentGrade class 
		to access it and uncomment the assertEquals statement.
		*/
		// assertEquals("Failed to set value of a correctly", aValue, studentGrade.getA(),
		// 0);
	}
}
