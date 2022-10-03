package Projekt;

import javax.swing.*;

public class KöttätandeVäxt extends Växt implements Vätska {
    private final String typAvVätska = "proteindryck";

    public KöttätandeVäxt(String namn, double höjd){
        super(namn, höjd);
    }

    @Override
    public void getVätska() {
        JOptionPane.showMessageDialog(null,getNamn() + " ska få " + (0.1 + (0.2 * getHöjd())) + " liter " + typAvVätska + " per dag");
    }
}
