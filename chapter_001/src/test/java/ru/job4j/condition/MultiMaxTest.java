package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Evgenii Ivanov (evg212009@yandex.ru).
* @version 1.
* @since 19.04.2019.
*/

public class MultiMaxTest {
	/**
	* Test firstmax.
	*/
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 1, 2);
        assertThat(result, is(4));
    }
	
	/**
	* Test secondmax.
	*/
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
	
	/**
	* Test thirdmax.
	*/
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 2, 4);
        assertThat(result, is(4));
    }
	
	/**
	* Test equally.
	*/
    @Test
    public void whenEquallyFirstSecondThird() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 1, 1);
        assertThat(result, is(1));
    }
}