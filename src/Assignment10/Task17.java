package Assignment10;

import java.util.Arrays;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int element = sc.nextInt();
        int[] array = new int[element];
        for (int i = 0;i<element;i++){
            System.out.println("Enter " + (i+1) + " element of the array: ");
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("The greatest element of the array is: " + array[element-1]);
        sc.close();
    }
}
