package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
		BubbleSort arr = new BubbleSort();
        int[] array = {4, 2, 1, 6, 5, 3};
        array = arr.sort(array);
        int[] result = {1, 2, 3, 4, 5, 6};
        assertThat(result, is(array));
    }
}
