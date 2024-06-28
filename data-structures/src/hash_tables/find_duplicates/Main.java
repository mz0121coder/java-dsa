package hash_tables.find_duplicates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    public static List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (map.get(n) == 2) duplicates.add(n);
        }
        return duplicates;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);

        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */

    }

}
