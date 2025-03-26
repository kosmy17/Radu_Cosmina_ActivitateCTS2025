package RestaurantS3SimpleFactory.main;

import RestaurantS3SimpleFactory.classes.Fabrica;
import RestaurantS3SimpleFactory.classes.FamiliaSupelor;
import RestaurantS3SimpleFactory.classes.TipSupa;


public class Main {
    public static void main(String[] args) throws Exception {
        //cream un ob de tip  fabrica
        Fabrica fabrica=new Fabrica();
        //cream un ob   de tipul interfetei cu apelare fabrica.creeaza (met din  fabrica)
        //si alegem  tipul   dorit
        FamiliaSupelor produs1= fabrica.creaza(TipSupa.supaLegume);
        produs1.descriere();
        FamiliaSupelor produs2= fabrica.creaza(TipSupa.supaCiuperci);
        produs2.descriere();

    }









}
