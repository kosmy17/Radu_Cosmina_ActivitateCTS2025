package Structurale.DEcorator.Pchetturistic.module;

public class ClasaconcretaCazare implements PachetTuristic {
    private String destinatie;
    private int pret;
    private boolean allinclusive;

    public ClasaconcretaCazare(String destinatie, int pret, boolean allinclusive) {
        this.destinatie = destinatie;
        this.pret = pret;
        this.allinclusive = allinclusive;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClasaconcretaCazare{");
        sb.append("destinatie='").append(destinatie).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", allinclusive=").append(allinclusive);
        sb.append('}');
        return sb.toString();
    }

    public String getDestinatie() {
        return destinatie;
    }

    @Override
    public void rezervaPachetul() {
        System.out.println("S-a  rezervat pachetul cu destinatie"+this.destinatie);
    }
}
