package Structurale.Strategy.ModululPLata.main;

import Structurale.Strategy.ModululPLata.module.*;

public class Main {
    public static void main(String[] args) {
        Iplata modplata1=new PlataCash();
        Iplata modplata2=new PlataPaypal();
        Iplata modplata3=new PlataCard();

        //client
        ClasaConcretaPersoana  client1=new ClasaConcretaPersoana(modplata1,"alina");
        client1.plateste(500);

        client1.setModplata(modplata2);
        client1.plateste(20);

    }
}
