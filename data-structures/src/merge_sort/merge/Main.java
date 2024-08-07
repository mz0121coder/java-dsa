package merge_sort.merge;

import java.util.Arrays;


public class Main {

    public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                i++;
            } else {
                combined[index] = array2[j];
                j++;
            }
            index++;
        }
        while (i < array1.length) {
            combined[index] = array1[i];
            i++;
            index++;
        }
        while (j < array2.length) {
            combined[index] = array2[j];
            j++;
            index++;
        }
        return combined;
    }

    public static void main(String[] args) {

        int[] array1 = {1, 3, 7, 8};
        int[] array2 = {2, 4, 5, 6};

        System.out.println(Arrays.toString(merge(array1, array2)));

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8]

         */

    }

}

