package Assignment10;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the final value n: ");
        int n = sc.nextInt();
        int number = 1;

        while (number<=n) {
            System.out.println("Enter a number: ");
            number = sc.nextInt();
            if ((number<=n)&&(number>0)) {
                System.out.println("The square number of " + number + " is " + Math.pow(number, 2));
            }
        }
        sc.close();
    }
}
