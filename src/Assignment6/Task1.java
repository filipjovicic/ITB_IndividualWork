package Assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    /*
    Create a method that prints an array and accepts as parameters an array.
    Inside the method find the highest value in the array, and then make that value the value of each element in the array.
    Utilize Scanner for the elements of the initial array. (Use the method 3-4 times)
      */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[4];
        for (int i = 0; i< array.length; i++){
            System.out.println("Enter " + i + " element of the array: ");
            array[i] = input.nextInt();
        }

        int[] array1 = {15, 19, 36, -1, 0, 72};
        int[] array2 = {-10, -35, 0, 17, 12};

        maxValueForAll(array);
        maxValueForAll(array1);
        maxValueForAll(array2);

        input.close();
    }
    public static void maxValueForAll(int[] array){
        int a = 0;
        for (int i = 0;i<array.length; i++){
            if (array[i]>a)
                a = array[i];
        }
        for (int j = 0; j<array.length;j++){
            array[j] = a;
        }
        System.out.println(Arrays.toString(array));
    }
}
