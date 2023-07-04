package Assignment8.task2;

public class Converter {
    private int rsd;
    private Currency currency;

    public Converter(){

    }

    public Converter(int rsd, Currency currency) {
        this.rsd = rsd;
        this.currency= currency;
    }

    public void setRsd(int rsd) {
        if (rsd>0) {
            this.rsd = rsd;
        } else {
            System.out.println("Invalidan unos!");
        }
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double convert(Converter converter){
        double a = 0;
        switch (currency){
            case AUD:
                a =  rsd/74.227;
                break;
            case EUR:
                a =  rsd/117.2797;
                break;
            case CAD:
                a =  rsd/80.2351;
                break;
            case GBP:
                a =  rsd/134.7733;
                break;
            case RUB:
                a =  rsd/1.3632;
                break;
            case USD:
                a =  rsd/109.2193;
                break;
            default:
                System.out.println("Invalid entry!");
        }
        return a;
    }

    @Override
    public String toString() {
        return "Converter{" +
                "rsd=" + rsd +
                ", currency=" + currency +
                '}';
    }
}