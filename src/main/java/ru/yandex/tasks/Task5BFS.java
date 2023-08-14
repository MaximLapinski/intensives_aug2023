package ru.yandex.tasks;

import java.util.*;

public class Task5BFS {
    public static int[] runSearch(int[][] tree, int node) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int j = 0; j < len; j++){
                int cur = queue.remove();
                ans.add(cur);
                if(tree[cur][0] > -1){
                    queue.add(tree[cur][0]);
                }
                if(tree[cur][1] > -1){
                    queue.add(tree[cur][1]);
                }
            }
        }
        int[] ansArr = new int[ans.size()];
        for (int i = 0; i < ansArr.length; i++){
            ansArr[i] = ans.get(i);
        }
        return ansArr;
    }

    public static int[] getBFSOrder(int[][] tree, int root) {
        return runSearch(tree, root);
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

        int[] ans1 = {0, 1, 6, 2, 3, 8, 4};
        int[] ans2 = {3, 4};
        int[] ans3 = {2};
        int[] ans4 = {6, 8};

        assert (Arrays.equals(getBFSOrder(tree, 0), ans1));
        assert (Arrays.equals(getBFSOrder(tree, 3), ans2));
        assert (Arrays.equals(getBFSOrder(tree, 2), ans3));
        assert (Arrays.equals(getBFSOrder(tree, 6), ans4));
    }
}
