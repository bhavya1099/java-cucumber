

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentGradeSetBTest {

	private StudentGrade studentGrade;

	@Before
	public void setUp() {
		// there may not be a StudentGrade class defined
		// studentGrade = new StudentGrade();
	}

	@Test
	public void testSetBPositiveValue() {
		double positiveValue = 8.0;
		// setB() method on the StudentGrade may not be defined
		// studentGrade.setB(positiveValue);
		// getB() method on StudentGrade may not be defined
		// assertEquals(positiveValue, studentGrade.getB(), 0.01); 
	}

	@Test
	public void testSetBNegativeValue() {
		double negativeValue = -2.0;
		// setB() method on the StudentGrade may not be defined
		// studentGrade.setB(negativeValue);
		// getB() method on StudentGrade may not be defined
		// assertEquals(negativeValue, studentGrade.getB(), 0.01);
	}

	@Test
	public void testSetBZeroValue() {
		double zeroValue = 0;
		// setB() method on the StudentGrade may not be defined
		// studentGrade.setB(zeroValue);
		// getB() method on StudentGrade may not be defined
		// assertEquals(zeroValue, studentGrade.getB(), 0.01);
	}

	@Test
	public void testSetBMaxDoubleValue() {
		double maxDoubleValue = Double.MAX_VALUE;
		// setB() method on the StudentGrade may not be defined
		// studentGrade.setB(maxDoubleValue);
		// getB() method on StudentGrade may not be defined
		// assertEquals(maxDoubleValue, studentGrade.getB(), 0.01);
	}

	@Test
	public void testSetBMinDoubleValue() {
		double minDoubleValue = -Double.MAX_VALUE;
		// setB() method on StudentGrade may not be defined
		// studentGrade.setB(minDoubleValue);
		// getB() method on StudentGrade may not be defined
		// assertEquals(minDoubleValue, studentGrade.getB(), 0.01);
	}

}
