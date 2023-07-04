package Assignment10;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of an array: ");
        int element = sc.nextInt();
        int[] array = new int[element];

        for (int i = 0;i<element;i++){
            System.out.println("Enter " + (i+1) + ". element of the array: ");
            array[i] = sc.nextInt();

        }
        for (int j = 0;j<element;j++){
            if (j%2!=0){
                System.out.print(array[j] + " ");
            }
        }

        sc.close();

    }
}
