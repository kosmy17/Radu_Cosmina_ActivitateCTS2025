package Structurale.Adapter.AdapaterClaseExMed.main;

import Structurale.Adapter.AdapaterClaseExMed.classes.FrameworkNOu.Masina;
import Structurale.Adapter.AdapaterClaseExMed.classes.FrameworkNOu.MasinaInchiriata;
import Structurale.Adapter.AdapaterClaseExMed.classes.Pachet;
import Structurale.Adapter.AdapaterClaseExMed.classes.PachetMasina;
import Structurale.Adapter.AdapaterClaseExMed.classes.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachet= new Pachet("Barcelona",250);
        //pentru pechetul asta avem metoda rezerva pachet
        pachet.rezervaPachet();
        //acum ne luam si o masina
        Masina masina=new MasinaInchiriata("ww", 5000);
        masina.inchiriazaMasina();
        //dar noi vrem  sa accesoam metoda  RezervaPachet
        PachetTuristic masina1 = new PachetMasina("Audi",2000);
        masina1.rezervaPachet();
    }
}
