package Assignment1;

import java.util.Scanner;

public class Task2 {
    /*
    Convert Celsius into Fahrenheits. User enters through scanner the temperature in Celsius in integer value
     and the program prints both in the format "31C = 87.8F",
      round the Fahrenheits to the first decimal.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");
        int tempC = input.nextInt();

        double tempF = tempC * 1.8 + 32;

        System.out.printf(tempC + "C" + " = " + "%.1f" + "F", tempF);

        input.close();
    }
}
