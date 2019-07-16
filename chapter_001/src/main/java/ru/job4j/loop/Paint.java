package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
* @author Evgenii Ivanov (evg212009@yandex.ru).
* @version 1
* @since 14.07.2019
*/

/**
* Построение правой стороны пирамиды.
*/

public class Paint {
	public String rightTrl(int height) {
		return this.loopBy(
		        height,
				height,
				(row, column) -> row >= column
		);
	}
	
	/**
	* Построение левой стороны пирамиды.
	*/
	
	public String leftTrl(int height) {
		return this.loopBy(
		        height,
				height,
				(row, column) -> row >= height - column -1
		);
	}
  
  /**
  * Построение пирамиды.
  */

    public String pyramid(int height) {
		return this.loopBy(
		        height,
				2 * height -1,
				(row, column) -> row >= height - column -1 && row + height -1 >= column
		);
	}
	
	private String loopBy(int height, int widht, BiPredicate<Integer, Integer> predict) {
		StringBuilder screen = new StringBuilder();
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != widht; column++) {
				if (predict.test(row, column)) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}
}
