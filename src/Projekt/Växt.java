package Projekt;

public class Växt {

    private double höjd;    //Inkapsling 1

    private String namn;    //Inkapsling 2

    public Växt(String namn, double höjd) {
        this.namn = namn;
        this.höjd = höjd;
    }

    public Växt(){}

    public double getHöjd() {   //Inkapsling 1
        return höjd;
    }

    public String getNamn() {   //Inkapsling 2
        return namn;
    }
}
