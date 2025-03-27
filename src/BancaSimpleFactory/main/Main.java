package BancaSimpleFactory.main;

import BancaSimpleFactory.classes.Fabrica;
import BancaSimpleFactory.classes.FamiliaCreditelor;
import BancaSimpleFactory.classes.TipCRedit;

public class Main {
    public static void main(String[] args) throws Exception {
        //cream un ob d etip fabrica
        Fabrica fabrica=new Fabrica();
        FamiliaCreditelor credit1= fabrica.creeaza(TipCRedit.CReditIMM);
        credit1.descriere();
        FamiliaCreditelor credit2= fabrica.creeaza(TipCRedit.CreditNevoiPersonale);
        credit2.descriere();

    }
}
