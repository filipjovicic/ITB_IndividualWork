package Assignment9.Task2;

public class MobilePhone extends Computer{
    private int camera;
    private Network network;
    public MobilePhone(){

    }

    public MobilePhone(int brojProcesora, int ram, int memorija, int camera, Network network) {
        super(brojProcesora, ram, memorija);
        this.camera = camera;
        this.network = network;
    }

    public double getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
    //"Broj procesora: 8, ram: 6GB, memorija: 128GB, kamera: 32Megapixela, mreza: 5G".
    @Override
    public String toString() {
        return "number Of Processors: " + numberOfProcessors +
                ", ram: " + ram + "GB" +
                ", storage: " + storage + "GB" +
                ", camera=" + camera + "Megapixel" +
                ", network: " + network;
    }
}