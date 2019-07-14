package ru.job4j.loop;

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
		StringBuilder screen = new StringBuilder();
		int width = height;
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != width; column++) {
				if (row >= column) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}
	
	/**
	* Построение левой стороны пирамиды.
	*/
	
	public String leftTrl(int height) {
    StringBuilder screen = new StringBuilder();
    int width = height;
    for (int row = 0; row != height; row++) {
        for (int column = 0; column != width; column++) {
            if (row >= width - column - 1) {
                screen.append("^");
            } else {
                screen.append(" ");
            }
        }
        screen.append(System.lineSeparator());
    }
    return screen.toString();
  }
  
  /**
  * Построение пирамиды.
  */

    public String pyramid(int height) {
    StringBuilder screen = new StringBuilder();
    int width = 2 * height - 1;
    for (int row = 0; row != height; row++) {
        for (int column = 0; column != width; column++) {
            if (row >= height - column - 1 && row + height - 1 >= column) {
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
