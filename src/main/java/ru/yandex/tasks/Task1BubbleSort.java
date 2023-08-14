package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1BubbleSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        Integer[] mas = new Integer[numbers.size()];
        numbers.toArray(mas);
        for(int i = 1; i < mas.length; i++){
            for(int j = 0; j < mas.length - 1; j++){
                if(mas[j + 1] < mas[j]){
                    int save = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = save;
                }
            }
        }
        numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(mas));
        return numbers;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }
}
