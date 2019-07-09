package com.amdocs.git.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.amdocs.git.Calculator;

public class CalculatorTest {

	Calculator cal = new Calculator();
	int result;
	
	@Test
	public void add() {
		result = cal.addition(2, 4);
		assertEquals(result,6);
	}
}
