package Structurale.Composite.FarmacieS8.module;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Isectiune{
   private String  denumire;
   private List<Isectiune> listaSectiuni=new ArrayList<>();

    public Sectiune(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaNod(Isectiune sectiune) {
        listaSectiuni.add(sectiune);
    }

    @Override
    public void stergeNod(Isectiune sectiune) {
        listaSectiuni.remove(sectiune);
    }

    @Override
    public void getNod(int index) {
        listaSectiuni.get(index);
    }

    @Override
    public void descriere() {
        System.out.println(" Sectiune: " +this.denumire);
        //parcurgem lista
        for(var elem: listaSectiuni){
            elem.descriere();
        }
    }
}
