package Projekt;

import javax.swing.*;

public class Palm extends Växt implements Vätska {
    private final String typAvVätska = "kranvatten";

    public Palm(String namn, double höjd){
        super(namn, höjd);
    }

    @Override
    public void getVätska() {       //Implementering av interfacemetoden, är väl också polymorfism?
        JOptionPane.showMessageDialog(null,getNamn() + " ska ha " + (0.5 * getHöjd()) + " liter " + typAvVätska);
    }
}
