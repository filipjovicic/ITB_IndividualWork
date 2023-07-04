package Assignment10;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = sc.nextInt();

        int divisibleByFive = 0;
        int product = 1;

        if ((firstNumber>0)&&(secondNumber>0)) {

            int a = Math.min(firstNumber, secondNumber);
            int b = Math.max(firstNumber, secondNumber);

            for (int i = a; i <= b; i++) {
                if (i % 5 == 0) {
                    product *= i;
                    divisibleByFive++;
                }
            }
            System.out.println("Product of numbers divisible by 5 ranging from " + a + " to " + b + " is " + product + " and there are " + divisibleByFive + " of them.");
        } else {
            System.out.println("Numbers must be positive!");
        }

        sc.close();
    }
}
