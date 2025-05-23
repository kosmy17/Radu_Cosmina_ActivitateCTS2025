package Structurale.DEcorator.SportivS7.module;

public class BiletDecorat  extends BiletDecorator{


    public BiletDecorat(iBilet bilet) {
        super(bilet);
    }

    @Override
    public void adaugaMesaj(String mesaj) {
        System.out.println(mesaj);
    }
}
