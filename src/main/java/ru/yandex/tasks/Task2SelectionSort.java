package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task2SelectionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        Integer[] array = new Integer[numbers.size()];
        numbers.toArray(array);
        for (int i = 0; i < array.length-1; i++) { // внешний обычный  цикл
            int min = i;

            for (int j = i + 1; j < array.length; j++) { // обычный цикл, но с отчетом с сортированных чисел
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];     // вставка отссортиованного числа, в положеную ему ячейку
            array[i] = array[min];
            array[min] = temp;
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
