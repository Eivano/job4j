package ru.job4j.condition;

/**
* @author Evgenii Ivanov (evg212009@yandex.ru).
* @version 1.
* @since 17.03.2019.
*/
public class DummyBot {
	/**
	* Отвечает на вопросы.
	* @param question Вопрос от клиента.
	* @return Ответ.
	*/
	public String answer(String question) {
		String rsl = "Привет, умник.";
		if ("Привет, Бот.".equals(question)) {
			System.out.println("Это ставит меня в тупик. Задайте другой вопрос.");
		
		} else if ("Привет, Бот.".equals(Greet)) { 
			System.out.println("Привет, умник.");
			rsl = "Привет, умник.";
		}
		return rsl;
	}
	public String answer(String question) {
		String rsl = "До скорой встречи.";
		if ("Пока.".equals(question)) {
			System.out.println("Это ставит меня в тупик. Задайте другой вопрос.");
			
		} else if ("Пока.".equals(Bye)) {
			System.out.println("До скорой встречи.");
			rsl = "До скорой встречи.";
		}
		return rsl;
	}
	public String answer(String question) {
		String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
		if ("Сколько будет 2 + 2?".equals(question)) {
			System.out.println("4");
			
		} else if ("Сколько будет 2 + 2?".equals(Unknown)) {
			System.out.println("Это ставит меня в тупик. Задайте другой вопрос.");
			rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
		}
		return rsl;
	}
}