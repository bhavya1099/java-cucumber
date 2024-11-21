


package br.masmangan.beecrowd.bee1002;

import org.junit.Test;
import org.junit.Assert;

public class CircleSetRadiusTest {

	@Test
	public void testValidRadiusValue() {
    /* This test case seems to be fine. However, if 'setRadius' method or the 'radius' variable is not defined or not accessible in the 'Circle' class (same package), it will cause a compilation error. */
		Circle circle = new Circle();
		double radius = 5.0;
		circle.setRadius(radius);
		// Changed from "circle.getRadius()" to "circle.radius"
		Assert.assertEquals(radius, circle.radius, 0);
	}

	@Test
	public void testNegativeRadiusValue() {
    /* This test case seems to be fine. However, if 'setRadius' method or the 'radius' variable is not defined or not accessible in the 'Circle' class (same package), it will cause a compilation error. */
		Circle circle = new Circle();
		double radius = -3.0;
		circle.setRadius(radius);
		// Changed from "circle.getRadius()" to "circle.radius"
		Assert.assertEquals(radius, circle.radius, 0);
	}

	@Test
	public void testMaxBoundaryRadiusValue() {
    /* This test case seems to be fine. However, if 'setRadius' method or the 'radius' variable is not defined or not accessible in the 'Circle' class (same package), it will cause a compilation error. */
		Circle circle = new Circle();
		double radius = Double.MAX_VALUE;
		circle.setRadius(radius);
		// Changed from "circle.getRadius()" to "circle.radius"
		Assert.assertEquals(radius, circle.radius, 0);
	}

	@Test(expected = NullPointerException.class)
	public void testNullRadiusValue() {
    /* This test case seems to be fine. However, if 'setRadius' method or the 'radius' variable is not defined or not accessible in the 'Circle' class (same package), it will cause a compilation error. */
		Circle circle = new Circle();
		Double radius = null;
		circle.setRadius(radius);
		// As NullPointerException expected, no need to assert in this test case.
	}

}


