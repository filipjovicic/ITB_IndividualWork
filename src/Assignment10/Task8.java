package Assignment10;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = sc.nextInt();

        int k = Math.min(firstNumber,secondNumber);
        int n = Math.max(firstNumber, secondNumber);

        double sum= 0;
        double counter = 0;

        for (int i = k;i<=n;i++){
            if (i%2==0){
                sum += i;
                counter++;
            }
        }

        double avg = sum/counter;
        System.out.println("Average value of numbers in the range " + k + " to " + n + " is " + avg);
        sc.close();
    }
}
