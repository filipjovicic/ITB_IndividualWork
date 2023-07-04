package Assignment10;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people: ");
        int numberOfPeople = sc.nextInt();
        int[] heights = new int[numberOfPeople];

        double sumOfHeights = 0;

        if (numberOfPeople>0) {

            for (int i = 0; i < numberOfPeople; i++) {
                System.out.println("Enter the height of " + (i + 1) + " person: ");
                int height = sc.nextInt();
                if (height>0) {
                    heights[i] = height;
                    sumOfHeights += height;
                } else {
                    System.out.println("Height must be greater than 0!");
                }
            }
            Arrays.sort(heights);
            System.out.println("Average height is: " + sumOfHeights / numberOfPeople + " and the tallest person is " + heights[numberOfPeople - 1]);
        }
        sc.close();
    }
}