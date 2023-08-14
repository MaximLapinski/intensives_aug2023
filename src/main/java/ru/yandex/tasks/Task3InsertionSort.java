package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task3InsertionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        Integer[] array = new Integer[numbers.size()];
        numbers.toArray(array);
        for(int i = 0; i < array.length; i++){
            int temp = array[i]; // делаем копию помеченного элемента
            int j = i;
            while (j 	> 0 && array[j - 1] >= temp) {
                array[j] = array[j - 1];
                --j;
            }
            array[j] = temp;
        }
        numbers = new ArrayList<>();
        Collections.addAll(numbers, array);
        return numbers;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }
}
