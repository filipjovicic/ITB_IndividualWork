package Assignment6;

import java.util.Scanner;

public class Task2 {
    /*
    Create a method that does currency conversion.
    Currencies used are EUR, USD, GBP.
    Write the conversions using switch, by checking which currency the user entered as parameter,
    and returns in the value in the new currency.
    In the main method, using a Scanner, user enters the number of dinars that he wants to convert into a currency, and
    the currency as a String.
    Write a couple of example calls in the main. Currencies are double values, and you can find them on the NBS website.

    EUR = 117,2954
    USD = 106,1977
    GBP = 133,8683
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the currency you want to convert to(EUR, USD, GBP): ");
        String currency = input.nextLine();

        System.out.println("Enter the number of dinars you want to convert: ");
        double dinar = input.nextDouble();

        if (conversion(dinar, currency) == -1) {
            System.out.println("Wrong entry!");

        } else {
            System.out.println("Your amount is: " + conversion(dinar, currency) + " " + currency.toUpperCase().trim());
        }

        if (conversion(1000, "      usd") == -1) {
            System.out.println("Wrong entry!");

        } else {
            System.out.println("Your amount is: " + conversion(1000, "        usd"));
        }


        if (conversion(-100, "eur") == -1) {
            System.out.println("Wrong entry!");

        } else {
            System.out.println("Your amount is: " + conversion(-100, "eur"));
        }



        if (conversion(750, "CAD") == -1) {
            System.out.println("Wrong entry!");

        } else {
            System.out.println("Your amount is: " + conversion(750, "CAD"));
        }

        input.close();
    }

    public static double conversion(double a, String b) {
        double c;
        switch (b.toUpperCase().trim()) {
            case "EUR":
                if (a > 0) {
                    c = a / 117.2954;
                } else {
                    c = -1;
                }
                break;
            case "USD":
                if (a > 0) {
                    c = a / 106.1977;
                } else {
                    c = -1;
                }
                break;
            case "GBP":
                if (a > 0) {
                    c = a / 133.8683;
                } else {
                    c = -1;
                }
                break;
            default:
                c = -1;
        }
        return c;
    }
}
