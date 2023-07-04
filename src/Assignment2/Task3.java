package Assignment2;

import java.util.Scanner;

public class Task3 {
    /*
    Write a program where user enters its day and month of birth and the program returns user's zodiac sign.
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your day of birth: (1-31)");
        int day = input.nextInt();
        System.out.println("Enter your month of birth: (1-12)");
        int month = input.nextInt();


        if ((day < 1) || (month < 1)) {
            System.out.println("Wrong entry!");
        } else if ((day >= 21 && day <= 31 && month == 3) || (day <= 20 && day <= 30 && month == 4)){
            System.out.println("Aries");
        } else if ((day >= 21 && day <= 30 && month == 4) || (day <= 21 && day <= 31 && month == 5)) {
            System.out.println("Taurus");
        } else if ((day >= 22 && day <= 31 && month == 5) || (day <= 21 && day <= 30 && month == 6)) {
            System.out.println("Gemini");
        } else if ((day >= 22 && day <= 30 && month == 6) || (day <= 22 && day <= 31 && month == 7)) {
            System.out.println("Cancer");
        } else if ((day >= 23 && day <= 31 && month == 7) || (day <= 22 && day <= 31 && month == 8)) {
            System.out.println("Leo");
        } else if ((day >= 23 && day <= 31 && month == 8) || (day <= 22 && day <= 30 && month == 9)) {
            System.out.println("Virgo");
        } else if ((day >= 23 && day <= 30 && month == 9) || (day <= 23 && day <= 31 && month == 10)) {
            System.out.println("Libra");
        } else if ((day >= 24 && day <= 31 && month == 10) || (day <= 22 && day <= 30 && month == 11)) {
            System.out.println("Scorpio");
        } else if ((day >= 23 && day <= 30 && month == 11) || (day <= 21 && day <= 31 && month == 12)) {
            System.out.println("Sagittarius");
        } else if ((day >= 22 && day <= 31 && month == 12) || (day <= 20 && day <= 31 && month == 1)) {
            System.out.println("Capricorn");
        } else if ((day >= 21 && day <= 31 && month == 1) || (day <= 19 && day <= 29 && month == 2)) {
            System.out.println("Aquarius");
        } else if ((day >= 20 && day <= 29 && month == 2) || (day <= 20 && day <= 31 && month == 3)) {
            System.out.println("Pisces");
        } else {
            System.out.println("Wrong entry!");
        }


        input.close();
    }
}