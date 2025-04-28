package Structurale.Adapter.AdapaterClaseExMed.classes.FrameworkNOu;

public class MasinaInchiriata extends Masina {


    public MasinaInchiriata(String model, int km) {
        super(model, km);
    }

    @Override
    public void inchiriazaMasina() {
        System.out.println("S- inchiriat masina  modeel"+getModel());
    }
}