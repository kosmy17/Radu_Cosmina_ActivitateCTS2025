package Structurale.DEcorator.Pchetturistic.main;

import Structurale.DEcorator.Pchetturistic.module.ClasaconcretaCazare;
import Structurale.DEcorator.Pchetturistic.module.PachetCazareDecorator;
import Structurale.DEcorator.Pchetturistic.module.PachetTuristic;
import Structurale.DEcorator.Pchetturistic.module.PachetTuristicDecorator;

public class Main {
    public static void main(String[] args) {
        //un ob  pachet turistic
        PachetTuristic pachet=new ClasaconcretaCazare("Madrid",4400, true );
        pachet.rezervaPachetul();
        PachetTuristicDecorator pachetDecorator =new PachetCazareDecorator(pachet);
        pachetDecorator.anuleazarezervare();
        pachetDecorator.rezervaPachetul();
        }
    }

