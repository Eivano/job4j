package ru.job4j.loop;

public class Board {
	public String paint(int width, int height) {
		StringBuilder screen = new StringBuilder();
		String ln = System.lineSeparator();
		for ( int i =0; i < width; i++) {
			for ( int j = 0; j < height; j++ ) {
				if ((i + j)% 2 == 1) {
					screen.append("X");
				} else {
					screen.append(" ");
				}
			}
			// добавляем перевод на новую строку.
			screen.append(ln);
		}
		return screen.toString();
	}
}