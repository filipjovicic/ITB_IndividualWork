package Assignment10;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("Result is: " + product(firstNumber,secondNumber)*2);

    }
    public static int product(int a, int b){
        return a*b;
    }
}
