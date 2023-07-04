package Assignment9.Task1;

public class Dog extends Animal {

    private boolean goodBoy;
    public Dog (){

    }

    public Dog(String name, String nickname, boolean goodBoy) {
        super(name, nickname);
        this.goodBoy = goodBoy;
    }

    public boolean isGoodBoy() {
        return goodBoy;
    }

    public void setGoodBoy(boolean goodBoy) {
        this.goodBoy = goodBoy;
    }

    @Override
    public String toString() {
        return super.toString() + " " + dogMethod() + " " + animalSound();
    }

    public String animalSound(){
        return "woof!";
    }

    public String dogMethod(){
        if (goodBoy){
            return "I am a good boy!";
        } else {
            return "I am a bad boy!";
        }
    }

}