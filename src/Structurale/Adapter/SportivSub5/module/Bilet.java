package Structurale.Adapter.SportivSub5.module;

public class Bilet implements Ibilet{
  private float pret;
  private String numeCumparator;

    public Bilet(float pret, String numeCumparator) {
        this.pret = pret;
        this.numeCumparator = numeCumparator;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bilet{");
        sb.append("pret=").append(pret);
        sb.append(", numeCumparator='").append(numeCumparator).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void rezervaBilet() {
        System.out.println("S-a rezervat  biletul pe numele "+numeCumparator);
    }

    @Override
    public void vindeBilet() {
        System.out.println("S-a vandut  biletul  cu pretul "+pret+"si numele "+numeCumparator);
    }
}
