package Assignment10;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numberOfRows = sc.nextInt();

        for (int i = 1;i<=numberOfRows;i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        sc.close();
    }
}
