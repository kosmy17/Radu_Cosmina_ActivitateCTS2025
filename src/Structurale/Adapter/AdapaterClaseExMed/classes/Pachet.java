package Structurale.Adapter.AdapaterClaseExMed.classes;

public class Pachet implements PachetTuristic{
   private  String destinatie;
   private int pret;

   //generam constr

    public Pachet(String destinatie, int pret) {
        this.destinatie = destinatie;
        this.pret = pret;
    }

    //generam Too string

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pachet{");
        sb.append("destinatie='").append(destinatie).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    public String getDestinatie() {
        return destinatie;
    }

    @Override
    public void descriere() {
        System.out.println("S-a cumparat pachectul cu  destinatie "+destinatie);
    }

    @Override
    public void rezervaPachet() {
        System.out.println("S-a rezervat pachectul cu  destinatie "+destinatie);
    }
}
