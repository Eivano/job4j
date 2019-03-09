package ru.job4j.calculator;

/**
* Calculator.
*
* @author Evgenii Ivanov (evg212009@yandex.ru).
* @version 1.
* @since 09.03.2019.
*/

public class Calculator {
	
	/**
	*Method add.
	*@param name first,second.
	*@return first+second.
	*/
	
	public double add(double first, double second) {
		return first + second;
	}
	
	/**
	*Method subtract.
	*@param name first,second.
	*@return first-second.
	*/

	public double subtract(double first, double second) {
		return first - second;
	}
	
	/**
	*Method divide.
	*@param name first,second.
	*@return first/second.
	*/

	public double div(double first, double second) {
		return first / second;
	}
	
	/**
	*Method multiply.
	*@param first,second.
	*@return first*second.
	*/

	public double multiple(double first, double second) {
		return first * second;
	}

}