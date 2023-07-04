package Assignment3;

public class Task1 {
    public static void main(String[] args) {
        /*
        Write a for loop that goes from 0 to 1000 and prints all numbers divisible by 3.         */

        int number = 0;

        for (int i = 0; i<=1000; i++){
            if ((i%3==0) && (i!=0)){
                number = i;
                System.out.print(number + " ");
            }
        }
    }
}