package Assignment10;

public class Task6 {
    public static void main(String[] args) {

        int number = 0;

        for (int i = 1;i<=50;i++){
            if (i%3==0){
                number++;
            }
        }
        System.out.println("There are " + number + " numbers divisible by 3");

    }
}
