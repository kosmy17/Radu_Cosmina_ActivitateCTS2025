package Creationale.SimpleFactory.SpitalS2SimpleFactory.classes;



public class Fabrica {
    //cream o functie publica  de tipul nterfetei si param  enum
    //ne ajuta sa alegem  tipul  de  personal  in main
    public PersonalSpital creaza(TipPersonal tip) throws Exception {
        switch (tip){
            case Brancardier:return new Brancardier();
            case Medic:return  new Medic();
            case Asistent:return  new Asistent();
            default:throw new Exception("Tipul ales nu este  valid");
        }
    }
}
