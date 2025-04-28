package Structurale.Adapter.SpitalSub5.model;

import Structurale.Adapter.SpitalSub5.model.Softnou.Ireteta;

public class AdapterObiecte implements Imedicament {
    //implememntam interfata din ce aveam
    //luam  atribut un ob din clasa noua
    private Ireteta reteta;

    public AdapterObiecte(Ireteta reteta) {
        this.reteta = reteta;
    }

    @Override
    public void descriere() {
        System.out.println(reteta);
    }

    @Override
    public void achizitioneazaMedicament() {
        //apelam metoda din softul nou
    reteta.prezintaReteta();
    }
}