package Structurale.Adapter.SportivSub5.main;

import Structurale.Adapter.SportivSub5.module.AdapterObiecte;
import Structurale.Adapter.SportivSub5.module.Bilet;
import Structurale.Adapter.SportivSub5.module.Ibilet;
import Structurale.Adapter.SportivSub5.module.SoftNou.Ebilet;
import Structurale.Adapter.SportivSub5.module.SoftNou.IeBilet;

public class Main {
    public static void main(String[] args) {
//luam un ob de  tipul Ibilet
        Ibilet bilet=new Bilet(10,"Alina");
        bilet.rezervaBilet();
        //luam un ob de tipul   Iebilet
        IeBilet biletEbilet=new Ebilet(5,"ion");
        //fcem legatura  intre softuri
       AdapterObiecte adapter=new AdapterObiecte(biletEbilet);
       adapter.vindeBilet();
    }
}
