package Assignment9.Task1;

import java.util.ArrayList;

/*
Create an abstract class that represents an animal.
Animal should have a name, nickname, abstract method that represents sound the animal makes.
Create classes dog and cat that extend animal.
Dog additionally has boolean attribute goodBoy and method that prints “I am a good boy” or “I am a bad boy”
depending on whether the variable goodBoy is true or false.
Cat has an attribute for weight and method that prints “I’m a chonk” or “I’m not a chonk” whether the weight exceeds
5kg or not. In both classes implement toString, which prints name and nickname in both cases.
 */
public class Task1 {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setName("Rex");
        dog1.setNickname("Kuca");
        dog1.setGoodBoy(false);

        Cat cat1 = new Cat();
        cat1.setName("Marko");
        cat1.setNickname("Maca");
        cat1.setWeight(6);

        Dog dog2 = new Dog("Miljana", "Mixy", true);
        Cat macka2 = new Cat("Felini", "Macmac", 3);

//        System.out.println(dog2);
//        System.out.println(macka2);

        ArrayList<Animal> list = new ArrayList<>();
        list.add(dog1);
        list.add(cat1);
        list.add(dog2);
        list.add(macka2);

        for (int i = 0; i<list.size();i++){
            Animal zivotinja = list.get(i);
            if (zivotinja instanceof Dog){
                System.out.println("dog: " + list.get(i).toString());
            } else {
                System.out.println("cat: " + list.get(i).toString());
            }
        }
    }
}