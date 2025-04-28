package Creationale.Singleton.Firstexample.classes;

public class Agentie {
    private String nume;
    private int angajati;

    //Singletona re 3 caract
    //prima
    //declaram o instanta   de tipul clasei: private static
    private static Agentie instance=null;

    //geream  const cu param si il  facem privat

    private Agentie(int angajati, String nume) {
        this.angajati = angajati;
        this.nume = nume;
    }

    /// cream o metoda (public static  synchronized) getInstance (atributele agentiei) -short  geti
    public static Agentie getInstance(int angajati, String nume) {
        if(instance==null){
            instance=new Agentie(angajati, nume);
        }
        {
            return instance;}

    }

    /// generam un  Tostring   sa  afisam
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agentie{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", angajati=").append(angajati);
        sb.append('}');
        return sb.toString();
    }
}
