package Assignment10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade as a number (1-5): ");
        int grades = sc.nextInt();

        switch (grades){
            case 1:
                System.out.println("F");
                break;
            case 2:
                System.out.println("D");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("B");
                break;
            case 5:
                System.out.println("A");
                break;
            default:
                System.out.println("Wrong entry! Grades must be between 1-5!");
        }

        sc.close();
    }
}
