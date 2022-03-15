package com.okdev.tdd.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.okdev.tdd.calculator.Calculator;

public class CalcuatorTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 2);
		assertEquals(3, result);
	}

}
