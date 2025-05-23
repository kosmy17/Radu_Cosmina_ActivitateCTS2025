package Structurale.Composite.RestaurantS8.module;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Ioptiune{
    private String denumire;
    private List<Ioptiune> listaOptiuni=new ArrayList<>();

    public Sectiune(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaNod(Ioptiune optiune) throws Exception {
        listaOptiuni.add(optiune);
    }

    @Override
    public void stergeNod(Ioptiune optiune) throws Exception {
    listaOptiuni.remove(optiune);
    }

    @Override
    public void getNod(int index) throws Exception {
    listaOptiuni.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Categorie: "+this.denumire);
        //avem lista  parcurgem lista
        for(var elem:listaOptiuni){
            //afisam  elementul
            elem.descriere();
        }
    }
}
