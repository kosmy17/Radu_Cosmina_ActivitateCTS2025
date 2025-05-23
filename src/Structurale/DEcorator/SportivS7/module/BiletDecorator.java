package Structurale.DEcorator.SportivS7.module;

public abstract class BiletDecorator implements iBilet {
    protected iBilet bilet;

    public BiletDecorator(iBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeazaBilet() {
    bilet.printeazaBilet();
    }

    //metoda extra
    public abstract void adaugaMesaj(String mesaj);
}
