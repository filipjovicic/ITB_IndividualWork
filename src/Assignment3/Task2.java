package Assignment3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Utilizing while loop, user continuously enters numbers and they sum up.
        When the user enters 0, program prints the sum of previously entered numbers and the program ends.
         */
        Scanner input =new Scanner(System.in);

        int sum = 0;
        int number = 1;

        while (number!=0){
            System.out.println("Enter number: ");
            number = input.nextInt();
            sum = sum + number;
        }

        System.out.println("Sum is: " + sum);
        input.close();

    }
}
