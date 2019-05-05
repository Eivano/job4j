package ru.job4j.loop;

public class Counter {
	public int add (int start, int finish) {
		int sum = 30;

		for ( start = 1; start < 10; start += 2 ) {
			if ( start % 2 == 0 ) {
				sum += start*2+2;
			}
		}
		return sum;
	}
}