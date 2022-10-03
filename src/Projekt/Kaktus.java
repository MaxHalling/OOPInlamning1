package Projekt;

import javax.swing.*;

public class Kaktus extends Växt implements Vätska {
    private final String typAvVätska = "mineralvatten";

    public Kaktus(String namn, double höjd){
        super(namn, höjd);
    }

    @Override
    public void getVätska() {
        JOptionPane.showMessageDialog(null,getNamn() + " ska få 2cl " + typAvVätska + " per dag.");
    }
}
