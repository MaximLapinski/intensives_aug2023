package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Task4DFS {
    public static void runSearch(int[][] tree, List<Integer> ans, int cur) {
        if(cur == -1) return;
        if(tree[cur][0] > -1) {
            runSearch(tree, ans, tree[cur][0]);
        }
        if(tree[cur][1] > -1) {
            runSearch(tree, ans, tree[cur][1]);
        }
        ans.add(cur);
    }

    public static int[] getDFSOrder(int[][] tree, int root) {
        List<Integer> ans = new ArrayList<>();
        runSearch(tree, ans, root);
        int[] ansArr = new int[ans.size()];
        for (int i = 0; i < ansArr.length; i++){
            ansArr[i] = ans.get(i);
        }
        return ansArr;
    }

    public static void selfCheck() {
        int[][] tree =
                {
                        {1, 6},
                        {2, 3},
                        {-1, -1},
                        {4, -1},
                        {-1, -1},
                        {-1, -1},
                        {-1, 8},
                        {-1, -1},
                        {-1, -1}
                };

        int[] ans1 = {2, 4, 3, 1, 8, 6, 0};
        int[] ans2 = {4, 3};
        int[] ans3 = {2};
        int[] ans4 = {8, 6};

        assert (Arrays.equals(getDFSOrder(tree, 0), ans1));
        assert (Arrays.equals(getDFSOrder(tree, 3), ans2));
        assert (Arrays.equals(getDFSOrder(tree, 2), ans3));
        assert (Arrays.equals(getDFSOrder(tree, 6), ans4));
    }
}
