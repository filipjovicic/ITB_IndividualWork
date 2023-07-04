package Assignment7.task1;

public class Employee {

    String ime;
    String prezime;
    int godinaZaposlenja;

    public Employee(){

    }

    public Employee(String ime, String prezime, int godinaZaposlenja){
        this.ime = ime;
        this.prezime = prezime;
        this.godinaZaposlenja = godinaZaposlenja;
    }

    public boolean moreThanTen(){
        if (2023 - godinaZaposlenja > 10){
            return true;
        } else return false;
    }

}