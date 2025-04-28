package Structurale.Adapter.SportivSub5.module.SoftNou;

public class Ebilet implements IeBilet{
   private float pret;
   private String cumparator;

    public Ebilet(float pret, String cumparator) {
        this.pret = pret;
        this.cumparator = cumparator;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ebilet{");
        sb.append("pret=").append(pret);
        sb.append(", cumparator='").append(cumparator).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void vindeEBilet() {
        System.out.println("S-a vandut EBiletul cu pretul "+pret);
    }
}
