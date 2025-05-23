package Structurale.Composite.Agentie.module;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Ioptiune{
    //clasa composite
    private String denumire;
    private List<Ioptiune> listaoptiuni=new ArrayList<>();

    public Categorie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaNod(Ioptiune optiune) throws Exception {
        listaoptiuni.add(optiune);
    }

    @Override
    public void stergeNod(Ioptiune optiune) throws Exception {
    listaoptiuni.remove(optiune);
    }

    @Override
    public void getNod(int index) throws Exception {
    listaoptiuni.get(index);
    }

    @Override
    public void descriereNod() {
        System.out.println("Categorie: "+this.denumire);
        //parcurgem lista
        for (var elem : listaoptiuni){
            elem.descriereNod();
        }
    }
}
