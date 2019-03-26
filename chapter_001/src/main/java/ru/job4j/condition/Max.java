package ru.job4j.condition;

/**
* @author Evgenii Ivanov (evg212009@yandex.ru).
* @version 1.
* @since 25.03.2019.
* Вычисление максимума из двух чисел и сравнение двух чисел.
*/
public class Max {
	/**
	* @param result Тернарное условие.
	* @return Ответ.
	*/
	public int max(int left, int right) {
		int result = left < right ? right : left;
		return result;
	}
	
}