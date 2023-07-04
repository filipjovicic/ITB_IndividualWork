package Assignment10;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = sc.nextInt();

        int c = minimum(firstNumber,secondNumber);

        System.out.println("Minimum value is " + c);
        sc.close();
    }
    public static int minimum(int a, int b){
        return Math.min(a,b);
    }
}
