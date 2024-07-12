

package br.masmangan.beecrowd.bee1001;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorSetATest {

	private Calculator calculator = new Calculator();

	@Test
	public void setAPositiveInputTest() {
		int positiveInput = 200;
		calculator.setA(positiveInput);
		// The method getA() is not present or not public in the class Calculator. Ensure that the method signature in Calculator class matches with getA()
		assertEquals("setAPositiveInputTest failed!", positiveInput, calculator.getA());
	}

	@Test
	public void setANegativeInputTest() {
		int negativeInput = -100;
		calculator.setA(negativeInput);
		// The method getA() is not present or not public in the class Calculator. Ensure that the method signature in Calculator class matches with getA()
		assertEquals("setANegativeInputTest failed!", negativeInput, calculator.getA());
	}

	@Test
	public void setAZeroInputTest() {
		int zeroInput = 0;
		calculator.setA(zeroInput);
		// The method getA() is not present or not public in the class Calculator. Ensure that the method signature in Calculator class matches with getA()
		assertEquals("setAZeroInputTest failed!", zeroInput, calculator.getA());
	}

	@Test
	public void setAMaxIntTest() {
		int maxInput = Integer.MAX_VALUE;
		calculator.setA(maxInput);
		// The method getA() is not present or not public in the class Calculator. Ensure that the method signature in Calculator class matches with getA()
		assertEquals("setAMaxIntTest failed!", maxInput, calculator.getA());
	}

	@Test
	public void setAMinIntTest() {
		int minInput = Integer.MIN_VALUE;
		calculator.setA(minInput);
		// The method getA() is not present or not public in the class Calculator. Ensure that the method signature in Calculator class matches with getA()
		assertEquals("setAMinIntTest failed!", minInput, calculator.getA());
	}

}
