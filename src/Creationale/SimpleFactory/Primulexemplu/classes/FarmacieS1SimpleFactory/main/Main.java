package Creationale.SimpleFactory.Primulexemplu.classes.FarmacieS1SimpleFactory.main;

import Creationale.SimpleFactory.Primulexemplu.classes.FarmacieS1SimpleFactory.classes.Fabrica;
import Creationale.SimpleFactory.Primulexemplu.classes.FarmacieS1SimpleFactory.classes.FamiliaMedicamentelor;
import Creationale.SimpleFactory.Primulexemplu.classes.FarmacieS1SimpleFactory.classes.TipcategorieMedicament;


public class Main {
    public static void main(String[] args) throws Exception {
        //OB de tip   fabrica
       Fabrica fabrica=new Fabrica();
        FamiliaMedicamentelor produs1= fabrica.creaza(TipcategorieMedicament.Body);
        produs1.descriere();
        FamiliaMedicamentelor produs2= fabrica.creaza(TipcategorieMedicament.Durere);
        produs2.descriere();
    }
}
