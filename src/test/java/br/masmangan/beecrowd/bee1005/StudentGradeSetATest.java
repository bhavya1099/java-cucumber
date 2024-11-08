
package br.masmangan.beecrowd.bee1005;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class StudentGradeSetATest {

	private StudentGrade studentGrade;

	@Before
	public void setup() {
		studentGrade = new StudentGrade();
	}

	@Test
	@Category(Categories.valid.class)
	public void testNormalAValueSet() {
		studentGrade.setA(85.5);
		assertEquals(85.5, studentGrade.getA(), 0.0);
	}

	@Test
	@Category(Categories.boundary.class)
	public void testSetAValueToZero() {
		studentGrade.setA(0);
		assertEquals(0.0, studentGrade.getA(), 0.0);
	}

	@Test
	@Category(Categories.invalid.class)
	public void testSetANegativeValue() {
		studentGrade.setA(-10.0);
		assertEquals(-10.0, studentGrade.getA(), 0.0);
	}

	@Test
	@Category(Categories.valid.class)
	public void testSetAVeryLargeValue() {
		studentGrade.setA(1e6);
		assertEquals(1e6, studentGrade.getA(), 0.0);
	}

}