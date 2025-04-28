package Creationale.SimpleFactory.Primulexemplu.classes;

public class Fabrica {
    //aici cream o  metoda care  sa ne ajute  in main sa alegem i  fucntei de ce  Enum, sa se  creaze  tipul ales
    //cream o  ffct care   returneaza un ob  de tipul interfetei cu param  de tipul enum
    public Ifabrica creaza(TipProdus tip) throws Exception {
        switch (tip){
            case TransportType:return new TransportType();
            case AccomodationType:return new AccomodationType();
            case AllinclusiveType:return new AllinclusiveType();
            default:throw new Exception("Tipul ales nu este valid.");
        }
    }

}
