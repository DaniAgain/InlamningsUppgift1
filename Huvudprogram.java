package Sprint1.Inlämningsuppgift1;

import javax.swing.*;

public class Huvudprogram {
    public static void main(String[] args) {

        Kaktusar Igge = new Kaktusar();
        Palmer Laura = new Palmer();
        Palmer Putte = new Palmer();
        KöttätandeVäxter Meatloaf = new KöttätandeVäxter();


        String växtNamn = JOptionPane.showInputDialog( null, "Vilken växt ska få vätska?");


        if (växtNamn.equalsIgnoreCase("Igge")) {
            JOptionPane.showMessageDialog(null, "Igge ska ha "
                    + Igge.vätskeIntag() + " liter "
                    + Igge.vätskeTyp());
        }
        else if (växtNamn.equalsIgnoreCase("Laura")){
            JOptionPane.showMessageDialog(null, "Laura ska ha "
                    + Laura.dagligtVätskeintagLaura() + " liter "
                    + Laura.vätskeTyp());
        }
        else if (växtNamn.equalsIgnoreCase("Putte")) {
            JOptionPane.showMessageDialog(null, "Putte ska ha "
                    + Putte.dagligtVätskeintagPutte() + " liter "
                    + Putte.vätskeTyp());
        }
        else if (växtNamn.equalsIgnoreCase("Meatloaf")){
            JOptionPane.showMessageDialog(null, "Meatloaf ska ha "
                    + Meatloaf.vätskeIntag() + " liter "
                    + Meatloaf.vätskeTyp());
        }
        else{
            JOptionPane.showMessageDialog(null, "Växten finns ej på växthotellet Greenest");
        }

    }
}