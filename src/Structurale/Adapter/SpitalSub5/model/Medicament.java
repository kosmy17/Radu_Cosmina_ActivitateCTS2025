package Structurale.Adapter.SpitalSub5.model;

public class Medicament implements Imedicament{
//luam  atribute
    private String denumire;
    private float pret;
//gerenam const


    public Medicament(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere() {
        System.out.println("acesta este un  medicament");
    }

    @Override
    public void achizitioneazaMedicament() {
        System.out.println("s-a  cumparat medicmentul  cu denumirea "+denumire);
    }
}
