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
	@Test
	public void testMinus() {
		Calculator calculator = new Calculator();
		int result = calculator.minus(1, 2);
		assertEquals(-1, result);
	}
	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(1, 2);
		assertEquals(2, result);
	}
	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		int result = calculator.divide(2, 2);
		assertEquals(1, result);
	}

}
