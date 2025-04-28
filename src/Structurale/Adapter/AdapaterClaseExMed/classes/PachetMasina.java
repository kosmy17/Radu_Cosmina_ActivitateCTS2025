package Structurale.Adapter.AdapaterClaseExMed.classes;

import Structurale.Adapter.AdapaterClaseExMed.classes.FrameworkNOu.MasinaInchiriata;

public class PachetMasina extends MasinaInchiriata implements PachetTuristic {
    //nu ne luam  atribut aici
    //extindem  clasa masina
    //implement  interfata Pachet turistic

    public PachetMasina(String model, int km) {
        super(model, km);
    }


    @Override
    public void descriere() {
        System.out.println("S-a cumparat pachectul cu  destinatie ");
    }

    @Override
    public void rezervaPachet() {
        //apelam metoda din proiectul pe care il aducem nou
        super.inchiriazaMasina();
    }



}

