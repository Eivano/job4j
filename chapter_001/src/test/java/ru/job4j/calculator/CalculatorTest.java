package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.jinit.Assert.assertThat;

public class CalculatorTest {
	@Test
	public void whenAddOnePlusOneThenTwo() {
		Calculator calc = new Calculator();
		double result = calc.add(1D, 1D);
		double expected = 2D;
		assertThat(result, is(expected))
	}
	@Test
	public void whenSubtractOneMinusOneThenTwo() {
		Calculator calc = new Calculator();
		double result = calc.subtract(1D, 1D);
		double expected = 2D;
		assertThat(result, is(expected))
	}
	@Test
	public void whenDivOnedivideOneThenTwo() {
		Calculator calc = new Calculator();
		double result = calc.div(1D, 1D);
		double expected = 2D;
		assertThat(result, is(expected))
	}
	@Test
	public void whenMultipleOnemultiplyOneThenTwo() {
		Calculator calc = new Calculator();
		double result = calc.multiple(1D, 1D);
		double expected = 2D;
		assertThat(result, is(expected))
	}
}