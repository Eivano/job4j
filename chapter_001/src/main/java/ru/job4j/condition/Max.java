package ru.job4j.condition;

/**
* @author Evgenii Ivanov (evg212009@yandex.ru).
* @version 1.
* @since 25.03.2019.
* Вычисление максимума из двух чисел и сравнение двух чисел.
*/
public class Max {
	/**
	* @Method max.
	* @param result Тернарное условие.
	* @return Первое максимальное число.
	*/
	public int max(int left, int right) {
		int result = left < right ? right : left;
		return result;
	}
	/**
	* @Method max2.
	* @param result Тернарное условие.
	* @return Второе максимальное число.
	*/
	public int max2(int left, int right) {
		int result = left > right ? left : right;
		return result;
	}
	/**
	* @Method equally.
	* @param result Тернарное условие.
	* @return Оба числа одинаковы.
	*/
	public int eq(int left, int right) {
		int result = left == right ? left : left;
		return result;
	}

}