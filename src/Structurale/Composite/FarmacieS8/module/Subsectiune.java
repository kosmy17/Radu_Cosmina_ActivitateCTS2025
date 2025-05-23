package Structurale.Composite.FarmacieS8.module;

public class Subsectiune implements Isectiune{
    private String denumire;

    public Subsectiune(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaNod(Isectiune sectiune) throws Exception {
        throw new Exception("ACesta este un nod  frunza.");
    }

    @Override
    public void stergeNod(Isectiune sectiune) throws Exception {
        throw new Exception("ACesta este un nod  frunza.");
    }

    @Override
    public void getNod(int index) throws Exception {
        throw new Exception("ACesta este un nod  frunza.");
    }

    @Override
    public void descriere() {
        System.out.println(" Subsectiune: "+this.denumire);

    }
}
