package br.masmangan.beecrowd.bee1005;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentGradeGetAverageTest {
    private double a;
    private double b;
    @Test
    public void testAverageWithPositiveNumbers() {
        a = 5.0;
        b = 10.0;
        double expected = (a * 3.5 + b * 7.5) / 11.0;
        assertEquals("Average with positive numbers is incorrect", expected, getAverage(), 0.001);
    }
    @Test
    public void testAverageWithNegativeNumbers() {
        a = -5.0;
        b = -10.0;
        double expected = (a * 3.5 + b * 7.5) / 11.0;
        assertEquals("Average with negative numbers is incorrect", expected, getAverage(), 0.001);
    }
    @Test
    public void testAverageWithMixedSignNumbers() {
        a = 5.0;
        b = -10.0;
        double expected = (a * 3.5 + b * 7.5) / 11.0;
        assertEquals("Average with mixed sign numbers is incorrect", expected, getAverage(), 0.001);
    }
    @Test
    public void testAverageWithZeroNumbers() {
        a = 0.0;
        b = 0.0;
        assertEquals("Average with zero numbers is incorrect", 0.0, getAverage(), 0.001);
    }
    @Test
    public void testAverageWithExtremeNumbers() {
        a = Double.MAX_VALUE;
        b = Double.MIN_VALUE;
        double expected = (a * 3.5 + b * 7.5) / 11.0;
        assertEquals("Average with extreme numbers is incorrect", expected, getAverage(), 0.001);
    }
    public double getAverage() {
        return (a * 3.5 + b * 7.5) / 11.0;
    }
}