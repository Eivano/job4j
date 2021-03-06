package ru.job4j.condition;

public class Triangle {
	
	/**
	* Метод вычисления периметра по длинам сторон.
	*
	* Формула.
	*
	* (a + b + c) / 2.
	*
	* @param a расстояние между точками a b.
	* @param b расстояние между точками a c.
	* @param c расстояние между точками b c.
    * @return Периметр.
    */

	public double period(double a, double b, double c) {
	    double p = ( a + b + c ) / 2;
		return p;
	}

	/**
	* Метод должен вычислить площадь треугольника.
	*
	* Формула.
	*
	* ґ p *(p - ab) * (p - ac) * (p - bc).
	*
	* где ґ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
	*
	* @return Вернуть площадь, если треугольник существует или -1.
	*/
	public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
		double rsl = -1;
		double a = new Point().distance(x1, y1, x2, y2);
		double b = new Point().distance(x2, y2, x3, y3);
		double c = new Point().distance(x1, y1, x3, y3);
		double p = period(a, b, c);
		if (this.exist(a, b, c)) {
			rsl = Math.sqrt (p * (p - a) * (p - b) * (p - c));
		}
		return rsl;
	}
	
	/**
	* Метод проверяет можно ли построить треугольник с такими длинами сторон.
	*
	* Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
	*
	* @param ab Длина от точки a b.
	* @param ac Длина от точки a c.
	* @param bc Длина от точки b c.
	* @return
	*/
	private boolean exist(double ab, double ac, double bc) {
	   return ab + ac > bc && ab + bc > ac && bc + ac > ab;

	}
}