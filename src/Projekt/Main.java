package Projekt;

import javax.swing.*;
import java.awt.*;

public class Main {

    public Main() {
        Vätska igge = new Kaktus("Igge", 0.2);
        Vätska laura = new Palm("Laura", 5);
        Vätska meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);
        Vätska putte = new Palm("Putte", 1);

        while (true) {
            try {
                String svar = JOptionPane.showInputDialog(null,"Vilken växt ska få vätska?");
                if (svar.toLowerCase().equals("igge")) {
                    InterfaceVätska(igge);
                    break;
                }
                if (svar.toLowerCase().equals("laura")) {
                    InterfaceVätska(laura);
                    break;
                }
                if (svar.toLowerCase().equals("meatloaf")) {
                    InterfaceVätska(meatloaf);
                    break;
                }
                if (svar.toLowerCase().equals("putte")) {
                    InterfaceVätska(putte);
                    break;
                }
                else {
                    JOptionPane.showMessageDialog(null,"Det finns ingen växt med detta namn, var god försök igen.");
                }
            }
            catch (NullPointerException e) {
                System.out.println("Du har valt att stänga ner programmet.");
                break;
            }
        }
    }

    public void InterfaceVätska(Vätska växt) {      //Användning av interfacemetod
        växt.getVätska();
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}