package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
         for (int p = 1; p < data.length; p++) {
	        if (data[0][0] != data[p][p]) {
				result = false;
			}
			if (data[data.length - 1][0] != data[data.length - 1 - p][p]) {
				result = false;
			}
       }
        return result;
    }
}