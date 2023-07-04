package Assignment5;

public class Task1 {
    /*
    Create a method that returns a boolean type and accepts as parameters 2 integers.
    The method returns true if those two integers are consecutive, for example 16 17 or 24 25.
    In the main method write with println several examples on how would you test it. (4-5 is enough)
         */
    public static void main(String[] args) {

        System.out.println("Numbers 1 and 2 are consecutive. " + consecutiveNumbers(1,2));
        System.out.println("Numbers 1 and 5 are consecutive. " + consecutiveNumbers(1,5));
        System.out.println("Numbers -1 and -2 are consecutive.  " + consecutiveNumbers(-1,-2));
        System.out.println("Numbers -1 and 0 are consecutive. " + consecutiveNumbers(-1,0));
        System.out.println("Numbers 1 and 1 are consecutive. " + consecutiveNumbers(1,1));
        System.out.println("Numbers 201 and 17 are consecutive. " + consecutiveNumbers(201, 17));
        System.out.println("Numbers 25 and 24 are consecutive.  " + consecutiveNumbers(25, 24));

    }
    public static boolean consecutiveNumbers(int a, int b){
        if ((b-a==1)||(a-b==1)){
            return true;
        }else {
            return false;
        }
    }
}