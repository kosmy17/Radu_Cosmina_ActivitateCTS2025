package Creationale.FactoryMethod.PachetTuristicFactoryMethod.main;

import Creationale.FactoryMethod.PachetTuristicFactoryMethod.classes.FabricaAllInclusivePachet;
import Creationale.FactoryMethod.PachetTuristicFactoryMethod.classes.FabricaCazarePachet;
import Creationale.FactoryMethod.PachetTuristicFactoryMethod.classes.FamiliaPachetTuristic;
import Creationale.FactoryMethod.PachetTuristicFactoryMethod.classes.Ifabrica;

public class Main {
    //cream o metoda static publica  de tip  void
    //care are   parametru un ob de tipul interfetei  fabricilor
    // care sa ne lase  sa  folosim la modul general functia "creeaza"
    public  static void method(Ifabrica fabrica){
        //crea, un  ob de tipul iNterfetei  pachetelor  si  apelam  fucntia creza
        FamiliaPachetTuristic  pachet1= fabrica.creaza();
        pachet1.descriere();

    }

    public static void main(String[] args) {
       //cream un ob de tipulales de noi fabrica
        FabricaCazarePachet pachet1=new FabricaCazarePachet();
        //apelam  met  de mai   sus
        method(pachet1);
        FabricaAllInclusivePachet pachet2= new FabricaAllInclusivePachet();
        method(pachet2);


    }
}
