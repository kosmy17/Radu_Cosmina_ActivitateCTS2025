package Structurale.Composite.FarmacieS8.main;

import Structurale.Composite.FarmacieS8.module.Isectiune;
import Structurale.Composite.FarmacieS8.module.Sectiune;
import Structurale.Composite.FarmacieS8.module.Subsectiune;

public class Main {
    public static void main(String[] args) throws Exception {
        //cream   diverse obiecte
        //sectiuni
        Isectiune sectiune1=new Sectiune("Raceala");
        Isectiune sectiune2=new Sectiune("Durere");
        Isectiune sectiune3=new Sectiune("Antibiotic");

        //subsectiuni
        Isectiune subsectiune1=new Subsectiune("adulti");
        Isectiune subsectiune2=new Subsectiune("copii");

        sectiune1.adaugaNod(subsectiune1);
        sectiune1.adaugaNod(subsectiune2);


        sectiune2.adaugaNod(subsectiune1);
        sectiune2.adaugaNod(subsectiune2);

        sectiune3.adaugaNod(subsectiune1);
        sectiune3.adaugaNod(subsectiune2);


        sectiune1.descriere();
        sectiune2.descriere();
        sectiune3.descriere();


    }
}
