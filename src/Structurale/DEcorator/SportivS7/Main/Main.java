package Structurale.DEcorator.SportivS7.Main;

import Structurale.DEcorator.SportivS7.module.Bilet;
import Structurale.DEcorator.SportivS7.module.BiletDecorat;
import Structurale.DEcorator.SportivS7.module.BiletDecorator;
import Structurale.DEcorator.SportivS7.module.iBilet;

public class Main {
    public static void main(String[] args) {
        iBilet bilet=new Bilet(150,"22.05",1);
        bilet.printeazaBilet();
        BiletDecorator biletdecorator=new BiletDecorat(bilet);
        biletdecorator.adaugaMesaj("la multi ani");
        biletdecorator.printeazaBilet();

    }
}
