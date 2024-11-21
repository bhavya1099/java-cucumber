

package br.masmangan.beecrowd.bee1001;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorSetBTest {
  
  @Test
  public void testForPositiveValue() {
	Calculator calculator = new Calculator();
	int positiveValue = 10;
	calculator.setB(positiveValue);
	assertEquals(positiveValue, calculator.getSum());
  }
  
  @Test
  public void testForNegativeValue() {
	Calculator calculator = new Calculator();
	int negativeValue = -10;
	calculator.setB(negativeValue);
	assertEquals(negativeValue, calculator.getSum());
  }
  
  @Test
  public void testForZeroValue() {
	Calculator calculator = new Calculator();
	int zeroValue = 0;
	calculator.setB(zeroValue);
	assertEquals(zeroValue, calculator.getSum());
  }
  
  @Test
  public void testForIntegerUpperLimit() {
	Calculator calculator = new Calculator();
	int maxIntegerValue = Integer.MAX_VALUE;
	calculator.setB(maxIntegerValue);
	assertEquals(maxIntegerValue, calculator.getSum());
  }
  
  @Test
  public void testForIntegerLowerLimit() {
	Calculator calculator = new Calculator();
	int minIntegerValue = Integer.MIN_VALUE;
	calculator.setB(minIntegerValue);
	assertEquals(minIntegerValue, calculator.getSum());
  }
}
 