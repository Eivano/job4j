package ru.job4j.condition;

/**
* @author Evgenii Ivanov (evg212009@yandex.ru).
* @version 1.
* @since 19.04.2019.
* Вычисление максимума из трёх чисел и сравнение трёх чисел.
*/

public class MultiMax {
	/**
	* @param result Тернарное условие.
	* @return Ответ.
	*/
	public int max(int first, int second, int third) {
		int result;
		   if ( first > second ) {
		   	result = first > third ? first : third;
		   } else ( second > first ) {
		   	result = second > third ? second : third;
		   }
		
		return result;
	}
}