package Assignment10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = sc.nextLine();

        for (int i = 1;i<=3;i++){
            System.out.println(name.toUpperCase() + " " + name.toUpperCase() + " " + name.toUpperCase() + " ");
        }
        sc.close();
    }
}
