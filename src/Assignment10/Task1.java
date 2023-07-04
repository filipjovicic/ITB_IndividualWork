package Assignment10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Absolute value of the number is: " + Math.abs(number));
        sc.close();
    }
}
