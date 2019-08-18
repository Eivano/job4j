package ru.job4j.array;

public class BubbleSort {
	
	public int[] sort(int[] array) {
		int value; // переменная.
        for (int a = array.length - 1; a > 0; a--) {
            for (int p = 0; p < a; p++) {
                  if (array[p] > array[p + 1]) {
                    value = array[p];
                    array[p] = array[p + 1];
                    array[p + 1] = value;
                }
            }
        }
        return array;
    }
} 
