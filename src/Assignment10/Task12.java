package Assignment10;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 1;

        while (number!=25) {
            System.out.println("Enter a number between 1-25: ");
            number = sc.nextInt();
            if ((number < 1) || (number > 25)) {
                System.out.println("Wrong entry!");
            } else {
                if (number % 2 == 0) {
                    System.out.println(number + " is even number!");
                }
            }
        }
        sc.close();
    }
}
