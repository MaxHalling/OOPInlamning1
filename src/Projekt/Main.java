package Projekt;

import javax.swing.*;

public class Main {

    public Main() {
        Vätska igge = new Kaktus("Igge", 0.2);
        Vätska laura = new Palm("Laura", 5);
        Vätska meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);
        Vätska putte = new Palm("Putte", 1);

        while (true) {
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
        }



    }

    public void InterfaceVätska(Vätska växt) {      //Användning av interfacemetod
        växt.getVätska();
    }



    public static void main(String[] args) {
        Main main = new Main();
    }
}