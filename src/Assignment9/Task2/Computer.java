package Assignment9.Task2;

public class Computer {
    protected int numberOfProcessors;
    protected int ram;
    protected int storage;
    public Computer(){

    }

    public Computer(int numberOfProcessors, int ram, int storage) {
        this.numberOfProcessors = numberOfProcessors;
        this.ram = ram;
        this.storage = storage;
    }

    public int getNumberOfProcessors() {
        return numberOfProcessors;
    }

    public void setNumberOfProcessors(int numberOfProcessors) {
        this.numberOfProcessors = numberOfProcessors;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "numberOfProcessors=" + numberOfProcessors +
                ", ram=" + ram +
                ", storage=" + storage +
                '}';
    }
}
