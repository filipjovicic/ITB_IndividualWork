package Assignment8.task1;

import java.util.ArrayList;

/*
Create a static method in the main that work like sql min, max, sum, avg, and distinct in SQL utilizing ArrayList<Integer>.
You don't have to create another class except main, and methods accept ArrayList<Integer> as the parametar.
Distinct returns new ArrayList<Integer> while other methods have return types int (min, max, sum) and double (avg)
 */
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(3);

        System.out.println("Minimum is: " + min(list));
        System.out.println("Maximum is: " + max(list));
        System.out.println("Sum is: " + sum(list));
        System.out.println("Average value is: " + avg(list));
        System.out.println("Distinct elements are: " + distinct(list));

    }
    public static int min(ArrayList<Integer> list){
        int min = list.get(0);
        for (int i = 0;i<list.size();i++){
            if (min>list.get(i)){
                min = list.get(i);
            }
        }
        return min;
    }
    public static int max(ArrayList<Integer> list){
        int max = list.get(0);
        for (int i = 0;i<list.size();i++){
            if (max<list.get(i)){
                max = list.get(i);
            }
        }
        return max;
    }
    public static int sum(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0;i<list.size();i++){
            sum += list.get(i);
        }
        return sum;
    }
    public static double avg(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0;i<list.size();i++){
            sum += list.get(i);
        }
        return (double) sum/list.size();
    }
    public static ArrayList distinct(ArrayList<Integer> list){
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int i = 0;i<list.size();i++){
            if (!uniqueList.contains(list.get(i))){
                uniqueList.add(list.get(i));
            }
        }
        return uniqueList;
    }
}
