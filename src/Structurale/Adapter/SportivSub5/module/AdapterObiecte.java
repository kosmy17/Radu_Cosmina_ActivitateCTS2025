package Structurale.Adapter.SportivSub5.module;

import Structurale.Adapter.SportivSub5.module.SoftNou.Ebilet;
import Structurale.Adapter.SportivSub5.module.SoftNou.IeBilet;

public class AdapterObiecte implements Ibilet{
   //Implementeaza interfata oe care o aveam
   //cream un ob de tipul interfetei  soft nou
   IeBilet bilet1=new Ebilet(25,"Ion");

    public AdapterObiecte(IeBilet bilet1) {
        this.bilet1 = bilet1;
    }

    @Override
    public void rezervaBilet() {
        System.out.println(bilet1);
    }

    @Override
    public void vindeBilet() {
        //apelam metoda  din softul nou
        bilet1.vindeEBilet();
    }

}
