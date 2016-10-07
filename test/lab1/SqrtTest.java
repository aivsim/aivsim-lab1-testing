package lab1;

import org.junit.Assert;
import org.junit.Test;

public class SqrtTest {

	@Test
	public void testNegativeSqrt() {
		double result = Sqrt.sqrt(-5);
		Assert.assertEquals(0.0, result, 0000.1);
	}
		
	@Test
	public void testNaNSqrt() {
		double result = Sqrt.sqrt(Double.NaN);
		Assert.assertEquals(0.0, result, 0000.0);
	}
	
	@Test
	public void testNegativeInfinitySqrt() {
		double result = Sqrt.sqrt(Double.NEGATIVE_INFINITY);
		Assert.assertEquals(0.0, result, 0000.1);
	}

	@Test
	public void testPositiveInfinitySqrt() {
		double result = Sqrt.sqrt(Double.POSITIVE_INFINITY);
		Assert.assertEquals(0.0, result, 0000.1);
	}	
	
	@Test
	public void testPositiveSqrt() {
		double result = Sqrt.sqrt(9);
		Assert.assertEquals(3, result, 0000.1);
	}
}