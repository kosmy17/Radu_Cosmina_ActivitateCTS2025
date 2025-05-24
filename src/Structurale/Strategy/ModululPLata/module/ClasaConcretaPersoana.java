package Structurale.Strategy.ModululPLata.module;

public class ClasaConcretaPersoana {
    private String nume;
    private Iplata modplata;

    public ClasaConcretaPersoana(Iplata modplata, String nume) {
        this.modplata = modplata;
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Iplata getModplata() {
        return modplata;
    }

    public void setModplata(Iplata modplata) {
        this.modplata = modplata;
    }

    public void plateste(double suma){
       modplata.plateste(nume, suma);
    }
}
