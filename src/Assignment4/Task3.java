package Assignment4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create two arrays and show which one has more elements
        (You don't need to use a loop, you can use if statement instead)
                 */

        int[] array1 = {15,1,155, 5, 5, 9, 44};
        int[] array2 = {1, 5, 50, 44, 15, 2, 6, 47};

        if (array1.length > array2.length) {
            System.out.println(Arrays.toString(array1));
        } else {
            System.out.println(Arrays.toString(array2));
        }

    }
}
