package Structurale.Composite.Agentie.main;

import Structurale.Composite.Agentie.module.Categorie;
import Structurale.Composite.Agentie.module.Ioptiune;
import Structurale.Composite.Agentie.module.Item;

public class Main {
    public static void main(String[] args) throws Exception {
        //cream diverse obiecte de tipul interfetei
        Ioptiune categorie1=new Categorie("destinatii");
        Ioptiune categorie2=new Categorie("Europa");
        Ioptiune categorie3=new Categorie("Africa");

        Ioptiune item1=new Item("Albania");
        Ioptiune item2=new Item("Bulgaria");
        Ioptiune item3=new Item("Egipt");
        Ioptiune item4=new Item("Maroc");
        //aplicatie software -meniu agentie turism
       categorie3.adaugaNod(item3);
       categorie3.adaugaNod(item4);
       categorie2.adaugaNod(item1);
       categorie2.adaugaNod(item2);
       //afisare
        //cel ami  inalt  nivel
        categorie1.adaugaNod(categorie2);
        categorie1.adaugaNod(categorie3);

        categorie1.descriereNod();

    }
}
