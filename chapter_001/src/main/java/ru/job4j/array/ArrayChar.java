package ru.job4j.array;

/**
 * Обертка над строкой.
 */
    public class ArrayChar {


    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();

           for(int index = 0; index < pref.length; index++) {
               if(pref[index] != wrd[index]) {
                   result = false;
				   break;
               }
           }

        // проверить. что массив data имеет первые элементы одинаковые с value
        return result;
    }
}