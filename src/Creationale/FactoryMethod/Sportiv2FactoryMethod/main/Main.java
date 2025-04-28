package Creationale.FactoryMethod.Sportiv2FactoryMethod.main;

import Creationale.FactoryMethod.Sportiv2FactoryMethod.classes.FabricaAtacant;
import Creationale.FactoryMethod.Sportiv2FactoryMethod.classes.FabricaFundas;
import Creationale.FactoryMethod.Sportiv2FactoryMethod.classes.FamiliaJucator;
import Creationale.FactoryMethod.Sportiv2FactoryMethod.classes.Ifabrica;

public class Main {
    //facem o  functie public  static  void separata  de main\
     //  in care avem ca param interfata IFabarica
    //si apelam   metoda  din interfata  fabrica  , dar care returneaza   de tipul Familie
    public static void method (Ifabrica fabrica){
        FamiliaJucator persoana1= fabrica.creeaza();
        persoana1.descriere();
    }
    public static void main(String[] args) {
        //cream ob  dorit de tipul  fabricii;
        FabricaFundas persoana1=new FabricaFundas();
        method(persoana1);
        FabricaAtacant persoana2=new FabricaAtacant();
        method(persoana2);
    }
}
