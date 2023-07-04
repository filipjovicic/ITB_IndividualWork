package Assignment9.Task2;

import java.util.ArrayList;


public class Task2 {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        laptop1.setNumberOfProcessors(4);
        laptop1.setRam(16);
        laptop1.setStorage(512);
        laptop1.setScreen(15.6);
        laptop1.setKeyboard(Keyboard.INTERNATIONAL);

        System.out.println(laptop1);

        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.setNumberOfProcessors(8);
        mobilePhone.setRam(6);
        mobilePhone.setStorage(128);
        mobilePhone.setCamera(32);
        mobilePhone.setNetwork(Network.G5);

        System.out.println(mobilePhone);

        ArrayList<Computer> list = new ArrayList<>();
        list.add(laptop1);
        list.add(mobilePhone);

        for (int i = 0;i<list.size();i++){
            Computer computer = list.get(i);
            if (computer instanceof Laptop){
                System.out.println((i+1) + ". object is a Laptop!");
            } else {
                System.out.println((i+1) + ". object is a Mobile Phone!");
            }
        }

    }
}
