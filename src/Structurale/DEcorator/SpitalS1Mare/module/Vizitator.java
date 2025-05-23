package Structurale.DEcorator.SpitalS1Mare.module;

public class Vizitator {
    private  String nume;
    private int  varsta;
    private  boolean areScrisoare;

    public Vizitator(String nume, int varsta, boolean areScrisoare) {
        this.nume = nume;
        this.varsta = varsta;
        this.areScrisoare = areScrisoare;
    }

    public boolean isAreScrisoare() {
        return areScrisoare;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }
}
