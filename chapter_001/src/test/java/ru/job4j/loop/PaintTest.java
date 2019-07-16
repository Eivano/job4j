package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author Evgenii Ivanov (evg212009@yandex.ru)
 * @version 1.
 * @since 14.07.2019.
 */
 
 /**
 * Тест правой стороны пирамиды.
 */
public class PaintTest {
    @Test
    public void whenPyramid4Right() {
        Paint paint = new Paint();
        String rst = paint.rightTrl(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("^   ")
                                .add("^^  ")
                                .add("^^^ ")
                                .add("^^^^")
                                .toString()
                )
        );
    }
	
	/**
	* Тест левой стороны пирамиды.
	*/
	@Test
    public void whenPyramid4Left() {
        Paint paint = new Paint();
        String rst = paint.leftTrl(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^")
                                .add("  ^^")
                                .add(" ^^^")
                                .add("^^^^")
                                .toString()
                )
        );
    }
	
	/**
	* Тест всей пирамиды.
	*/
    @Test
    public void whenPyramid() {
        Paint paint = new Paint();
        String rst = paint.pyramid(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                  .add("   ^   ")
                                  .add("  ^^^  ")
                                  .add(" ^^^^^ ")
                                  .add("^^^^^^^")
                                  .toString()
                )
        );


    }

}