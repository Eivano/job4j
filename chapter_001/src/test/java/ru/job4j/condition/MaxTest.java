package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Evgenii Ivanov (evg212009@yandex.ru).
* @version 1.
* @since 25.03.2019.
*/

public class MaxTest {
	/**
	* Test max.
	*/
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }
	/**
	* Test max2.
	*/
    @Test
    public void whenMax2To1Then2() {
        Max max2 = new Max();
        int result = max2.max2(2, 1);
        assertThat(result, is(2));
    }
	/**
	* Test equally.
	*/
    @Test
    public void whenEqually1To1Then1() {
        Max eq = new Max();
        int result = eq.eq(1, 1);
        assertThat(result, is(1));
    }
}