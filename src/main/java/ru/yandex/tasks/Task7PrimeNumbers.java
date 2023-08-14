package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7PrimeNumbers {

    public static boolean checkSimple(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int[] findPrimes (int N) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 2; i <= N; i++){
            if(checkSimple(i)){
                ans.add(i);
            }
        }
        int[] ansArr = new int[ans.size()];
        for (int i = 0; i < ansArr.length; i++){
            ansArr[i] = ans.get(i);
        }
        return ansArr;
    }

    public static void selfCheck() {
        int[] output = {2, 3, 5};

        assert (Arrays.equals(output, findPrimes(5)));
    }
}
