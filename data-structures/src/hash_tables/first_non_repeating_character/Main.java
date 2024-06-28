package hash_tables.first_non_repeating_character;

import java.util.HashMap;
import java.util.Map;


public class Main {

    public static Character firstNonRepeatingChar(String string) {
        String singles = "";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : string.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) == 1) {
                singles += c;
            } else {
                singles = singles.replace(String.valueOf(c), "");
            }
        }
        return singles.length() > 0 ? singles.charAt(0) : null;
    }


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));

        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */

    }

}
