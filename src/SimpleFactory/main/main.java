package SimpleFactory.main;

import SimpleFactory.classes.Fabrica;
import SimpleFactory.classes.Ifabrica;
import SimpleFactory.classes.TipProdus;

public class main {
    public static void main(String[] args) throws Exception {
        //cream un ob de tipul  Fabrica
        Fabrica fabrica=new Fabrica();
        //cream  un ob de tipul interfetei  si  apelam metoda fabrica.creeaza(Tip Produs)
        Ifabrica produs1= fabrica.creaza(TipProdus.AccomodationType);
        produs1.descriereTip();
        Ifabrica produs2= fabrica.creaza(TipProdus.AllinclusiveType);
        produs2.descriereTip();
    }
}
