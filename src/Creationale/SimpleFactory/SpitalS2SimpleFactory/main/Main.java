package Creationale.SimpleFactory.SpitalS2SimpleFactory.main;

import Creationale.SimpleFactory.SpitalS2SimpleFactory.classes.Fabrica;
import Creationale.SimpleFactory.SpitalS2SimpleFactory.classes.PersonalSpital;
import Creationale.SimpleFactory.SpitalS2SimpleFactory.classes.TipPersonal;

public class Main {
    public static void main(String[] args) throws Exception {
        //cream un  ob de  tipul  fabrica
        Fabrica fabrica=new Fabrica();
        //cream un produs de  tiupul Interfetei si  apelam metoda din fabrica.creaaza(tipPersona)
        PersonalSpital persoana1= fabrica.creaza(TipPersonal.Brancardier);
        persoana1.descriere();
        PersonalSpital persoana2= fabrica.creaza(TipPersonal.Medic);
        persoana2.descriere();
    }
}
