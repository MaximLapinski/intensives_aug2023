package ru.yandex.tasks;

public class Task8BinarySearch {

    public static int binSearch(int number, int[] sortedList, int l, int r){
        if(l >= r){
            return -1;
        }
        int mid = (r + l) / 2;
        if(sortedList[mid] > number){
            return binSearch(number, sortedList, l, mid);
        }
        if(sortedList[mid] < number){
            return binSearch(number, sortedList, mid, r);
        }
        return mid;
    }
    public static int find(int number, int[] sortedList) {

        return binSearch(number, sortedList, 0, sortedList.length);
    }

    public static void selfCheck() {
        int[] input = {1, 3, 5, 7, 9};

        for (int i = 0; i < input.length; i++) {
            assert (find(input[i], input) == i);
        }
    }
}
