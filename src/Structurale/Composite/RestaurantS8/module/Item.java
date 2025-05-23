package Structurale.Composite.RestaurantS8.module;

public class Item implements Ioptiune{
    private String denumire;

    public Item(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaNod(Ioptiune optiune) throws Exception {
        throw new Exception("Acesta este un nod frunza.");
    }

    @Override
    public void stergeNod(Ioptiune optiune) throws Exception {
        throw new Exception("Acesta este un nod frunza.");
    }

    @Override
    public void getNod(int index) throws Exception {
        throw new Exception("Acesta este un nod frunza.");
    }

    @Override
    public void descriere() {
        System.out.println("Item: "+this.denumire);
    }
}
