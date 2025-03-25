package SngletonRegistry1.main;

import SngletonRegistry1.classes.Produs;
import SngletonRegistry1.classes.ProdusMagazin;

public class Main {
    public static void main(String[] args) {
        //cream ob de tipul Interfeti si  apelam met getInstance
        ProdusMagazin produs1= Produs.getInstance(150,"lapte");
        produs1.afiseazaProdus();
        ProdusMagazin produs2=Produs.getInstance(100,"lapte");
        produs2.afiseazaProdus();

        ProdusMagazin produs3= Produs.getInstance(100,"oua");
        produs3.afiseazaProdus();
        ProdusMagazin produs4=Produs.getInstance(50,"oua");
        produs4.afiseazaProdus();


    }
}
