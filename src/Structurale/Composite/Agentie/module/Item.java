package Structurale.Composite.Agentie.module;

import java.sql.SQLOutput;

public class Item implements  Ioptiune{
    private  String descriere;

    public Item(String descriere) {
        this.descriere = descriere;
    }



    @Override
    public void adaugaNod(Ioptiune optiune) throws Exception {
        throw new Exception("Acesta este un nod frunza");

    }

    @Override
    public void stergeNod(Ioptiune optiune) throws Exception {
        throw new Exception("Acesta este un nod frunza");
    }

    @Override
    public void getNod(int index) throws Exception {
        throw new Exception("Acesta este un nod frunza");
    }

    @Override
    public void descriereNod() {
        System.out.println("Item: "+ this.descriere);
    }


}
