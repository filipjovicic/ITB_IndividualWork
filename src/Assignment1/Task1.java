package Assignment1;

import java.util.Scanner;

public class Task1 {
    /*
    Utilize scanner and enter your name and last name (separately) and birth year,
    print your name and lastname and how old you are.
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your lastname: ");
        String lastname = input.nextLine();

        System.out.println("Unesite godinu rodjenja: ");
        int birthYear = input.nextInt();

        System.out.println(name + " " + lastname + ", " + (2023 - birthYear));

        input.close();
    }
}