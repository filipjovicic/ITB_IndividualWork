package Assignment9.Task2;

public enum Network {
    G3("3G"), G4("4G"), G5("5G");

    String network;
    Network(String network){
        this.network = network;
    }
    public String getNetwork() {
        return network;
    }

    @Override
    public String toString() {
        return network;
    }
}
