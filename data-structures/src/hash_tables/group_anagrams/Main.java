package hash_tables.group_anagrams;

import java.util.*;


public class Main {

    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for (String string : strings) {
            String sorted = sortChars(string);
            if (!map.containsKey(sorted)) {
                List<String> list = new ArrayList<>();
                list.add(string);
                map.put(sorted, list);
            } else {
                map.get(sorted).add(string);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static String sortChars(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */

    }

}
