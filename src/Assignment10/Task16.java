package Assignment10;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of an array: ");
        int element = sc.nextInt();
        int[] array = new int[element];

        for (int j = 0; j< array.length;j++){
            System.out.println("Enter " + (j+1) + " element of the array: ");
            array[j] = sc.nextInt();
        }

        for (int i = array.length-1;i>=0;i--){
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
