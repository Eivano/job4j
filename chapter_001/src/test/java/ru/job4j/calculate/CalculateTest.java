package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Evgenii Ivanov (evg212009@yandex.ru).
* @version 1.
* @since 06.03.2019.
*/

public class CalculateTest {
/**
* Test echo.
*/
@Test
public void whenTakeNameThenThreeEchoPlusName(){
  String input = "Evgenii Ivanov";
  String expect = "Echo, echo, echo : Evgenii Ivanov";
  Calculate calc = new Calculate();
  String result = calc.echo(input);
  assertThat(result, is(expect));

}



}