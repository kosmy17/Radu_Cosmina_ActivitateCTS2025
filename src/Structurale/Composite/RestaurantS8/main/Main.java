package Structurale.Composite.RestaurantS8.main;

import Structurale.Composite.RestaurantS8.module.Ioptiune;
import Structurale.Composite.RestaurantS8.module.Item;
import Structurale.Composite.RestaurantS8.module.Sectiune;

public class Main {
    public static void main(String[] args) throws Exception {
        //cream  diverse  obiecte
        Ioptiune sectiune1=new Sectiune("Startere");
        Ioptiune sectiune2=new Sectiune("Bauturi");
        Ioptiune sectiune3=new Sectiune("Desert");
        Ioptiune subsectiune1=new Sectiune("Sucuri");
        Ioptiune subsectiune2=new Sectiune("cafea");

        Ioptiune item1=new Item("cola");
        Ioptiune item2=new Item("apa plata");
        Ioptiune item3=new Item("expresso");
        Ioptiune item4=new Item("cappucino");
        Ioptiune item5=new Item("cecler");

        //le  organizam
        sectiune2.adaugaNod(subsectiune1);
        sectiune2.adaugaNod(subsectiune2);
        subsectiune1.adaugaNod(item1);
        subsectiune1.adaugaNod(item2);
        subsectiune2.adaugaNod(item3);
        subsectiune2.adaugaNod(item4);

        //afisare de la cel  mai sus  nivel

        sectiune2.adaugaNod(subsectiune1);
        sectiune2.adaugaNod(subsectiune2);
        sectiune3.adaugaNod(item5);

        sectiune1.descriere();
        sectiune2.descriere();
        sectiune3.descriere();


    }
}
