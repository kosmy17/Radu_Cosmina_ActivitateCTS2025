package Creationale.SimpleFactory.Primulexemplu.classes.BancaSimpleFactory.classes;

public class Fabrica {
    //cream o met publica de tipulimnterfeti si  cu param  ENum
    /// creaza produsul in main
    public  FamiliaCreditelor creeaza(TipCRedit tip) throws Exception {
        switch (tip){
            case CReditIMM:return new CReditIMM();
            case CreditIpotecar:return new CreditIpotecar();
            case CreditNevoiPersonale:return new CreditNevoiPersonale();
            default:throw new Exception("Tipulnu este valid.");
        }
    }
}
