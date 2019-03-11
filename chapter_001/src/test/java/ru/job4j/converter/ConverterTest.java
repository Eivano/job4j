package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConverterTest {
	@Test
	public void when60RubleToDollarThen1() {
		Converter converter = new Converter();
		int result = converter.rubleToDollar(60);
		assertThat(result, is(1));
	}
	
	@Test
	public void when70RubleToEuroThen1() {
		Converter converter = new Converter();
		int result = converter.rubleToEuro(70);
		assertThat(result, is(1));
	}
	
	@Test
	public void when1EuroToRubleThan70() {
		Converter converter = new Converter();
		int result = converter.euroToRuble(1);
		assertThat(result, is(70));
	}
	
	@Test
	public void when1DollarToRubleThan60() {
		Converter converter = new Converter();
		int result = converter.dollarToRuble(1);
		assertThat(result, is(60));
	}
} 