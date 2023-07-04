package Assignment10;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1-17: ");
        int number = sc.nextInt();

        for (int i = 1;i<18;i++){
            if (i%number!=0){
                System.out.println(i + " is not divisible by " + number);
            }
        }
        sc.close();
    }
}
