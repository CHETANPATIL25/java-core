package com.learning.core.day10;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class D10P07 
{
	@Test
	public void testAdd()
	{
		Calculator calculator = new Calculator();
		int result = calculator.add(3,4);
		assertEquals(7,result);
	}
	
	@Test
	public void testSub()
	{
		Calculator calculator = new Calculator();
		int result = calculator.sub(5,2);
		assertEquals(3,result);
	}
}
