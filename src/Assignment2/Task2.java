package Assignment2;

import java.util.Scanner;

public class Task2 {
    /*
    Create variables "username" and "password" and assign them a value.
    User enters through Scanner two values that should represent username and password and the program needs to compare them.
    If the username and password match, print "Successful log in",
    if one of them is wrong print the message "Incorrect username or password".
       */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String username = "username123";
        String password = "password";

        System.out.println("Enter your username: ");
        String enterUsername = input.nextLine();

        System.out.println("Enter your password: ");
        String enterPassword = input.nextLine();

        if (enterUsername.equals(username) && enterPassword.equals(password)){
            System.out.println("Successful log in");
        } else {
            System.out.println("Incorrect username or password");
        }
        input.close();
    }
}