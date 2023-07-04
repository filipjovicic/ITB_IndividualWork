package Assignment3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Utilizing while loop, write a program that sums the numbers user enters.
        At least one number needs to be entered (do while loop allows that).
        Program prints the sum after you enter 0 or a negative number.
                 */
        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;

        do {
            System.out.println("Enter number: ");
            number = input.nextInt();
            if (number > 0) {
                sum = sum + number;
            }
        } while (number > 0) ;
        System.out.println("Sum is: " + sum);
        input.close();
    }
}
