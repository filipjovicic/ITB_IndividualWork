package Assignment9.Task2;

public class Laptop extends Computer{
    private double screen;
    private Keyboard keyboard;
    public Laptop(){

    }

    public Laptop(int brojProcesora, int ram, int memorija, double screen, Keyboard keyboard) {
        super(brojProcesora, ram, memorija);
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "number Of Processors: " + numberOfProcessors +
                ", ram: " + ram + "GB" +
                ", storage: " + storage + "GB" +
                ", screen: " + screen + "\""  +
                ", keyboard: " + keyboard;
    }
}
