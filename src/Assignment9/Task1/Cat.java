package Assignment9.Task1;

public class Cat extends Animal {
    private double weight;
    public Cat(){

    }

    public Cat(String name, String nickname, double weight) {
        super(name, nickname);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + " " + catMethod() + " " + animalSound();
    }
    public String animalSound(){
        return "meow";
    }

    public String catMethod(){
        if (weight >5){
            return "I am a chonk!";
        } else {
            return "I am not a chonk!";
        }
    }
}
