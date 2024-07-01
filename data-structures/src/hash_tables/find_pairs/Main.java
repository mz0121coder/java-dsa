package hash_tables.find_pairs;

import java.util.*;


public class Main {

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        List<int[]> pairs = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int n : arr1) set.add(n);
        for (int num : arr2) {
            int diff = target - num;
            if (set.contains(diff)) pairs.add(new int[]{diff, num});
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]

        */

    }

}


