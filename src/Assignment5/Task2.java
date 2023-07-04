package Assignment5;

public class Task2 {
    /*
    Create a method that prints text and accepts as parameters two Strings.
    The print is in the following format: "Name: " text1 "and Lastname: " text2.
    text1 needs to be in all caps, while text2 needs to be without capital letters.
    In the main method use a couple of examples on how would you test it. (2-3 is enough)
           */
    public static void main(String[] args) {

        nameAndLastname("Filip", "Jovicic");
        nameAndLastname("fIlIp", "         jOvIciC");
        nameAndLastname("FILIP", "JOVICIC");
    }
    public static void nameAndLastname(String a, String b){
        System.out.println("Name: " + a.toUpperCase().trim() + " and Lastname: " + b.toLowerCase().trim());
    }
}
