package Assignment2;

import java.util.Scanner;

public class Task1 {

    /*
    Through Scanner enter the year, and the program needs to calculate if the year is a leap year.
     */
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = input.nextInt();

        if (((year % 400 == 0) || ((year % 100!=0) && (year % 4==0)))){
            System.out.println("It is a leap year");
        }else {
            System.out.println("It is not a leap year");
        }
        input.close();
    }
}
