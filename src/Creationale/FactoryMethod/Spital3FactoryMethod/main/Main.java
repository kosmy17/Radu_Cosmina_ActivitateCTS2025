package Creationale.FactoryMethod.Spital3FactoryMethod.main;

import Creationale.FactoryMethod.Spital3FactoryMethod.classes.FabricaAsistent;
import Creationale.FactoryMethod.Spital3FactoryMethod.classes.FabricaBrancardier;
import Creationale.FactoryMethod.Spital3FactoryMethod.classes.FamiliaPersonalSpital;
import Creationale.FactoryMethod.Spital3FactoryMethod.classes.Ifabrica;

public class Main {
    //facem  o metoda  separata de main public  static   void
    //in care avem  ca parametru  un ob de tipul interfetei  fabricilor
    public static  void method(Ifabrica fabrica){
        //cream un  ob e tipul   interefet  din familia pachetelor
        //si apelam   parametru.metoda din  interfata   fabricilor.
        FamiliaPersonalSpital persoana1= fabrica.creaza();
        persoana1.descriere();
    }
    public static void main(String[] args) {
        //cream obiectul  dorrit de  tipul  fabricii
        FabricaAsistent persoana1=new FabricaAsistent();
        //apelam  methoda cu  param nou creat
        method(persoana1);
        FabricaBrancardier persoana2=new FabricaBrancardier();
        method(persoana2);

    }
}
