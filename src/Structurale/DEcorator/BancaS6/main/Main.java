package Structurale.DEcorator.BancaS6.main;

import Structurale.DEcorator.BancaS6.module.Iplata;
import Structurale.DEcorator.BancaS6.module.PlataDecorat;
import Structurale.DEcorator.BancaS6.module.PlataDecorator;
import Structurale.DEcorator.BancaS6.module.plata;

public class Main {
    public static void main(String[] args) {
        //cream o plata
        Iplata plata1=new plata("22.05");
        plata1.platesteOnline();
        plata1.platesteNormalcuCardul();
        PlataDecorator plataDecorator=new PlataDecorat(plata1);
        plataDecorator.platesteContactless();
        plataDecorator.platesteNormalcuCardul();
        plataDecorator.platesteOnline();
    }
}
