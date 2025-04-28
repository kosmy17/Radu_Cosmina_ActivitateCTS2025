package Creationale.Singleton.SngletonRegistry1.classes;

import java.util.HashMap;
import java.util.Map;

public class Produs  implements  ProdusMagazin{
    //analizam interfata si cream atributele de care avem nevoie
    private float stoc;
    private String numeProdus;

    //aplicam cele  3 principii ale SIngletonului
    //declaram  un  ob (private static) de tipul clasei intr-un map
    //Map<Cheie,clasa>
    private static Map<String,Produs> mapProdus =new HashMap<>() ;
    //generam   constr  cu param si il facem privat
   private Produs(float stoc, String numeProdus) {
        this.stoc = stoc;
        this.numeProdus = numeProdus;
    }
    //cream  metoda  public static  synchronized getinstance (atributele clasei)
    public static synchronized  ProdusMagazin getInstance(float stoc, String numeProdus) {
       if (mapProdus.containsKey(numeProdus)){
           //altfel returneaza cheia - numeProdus
            mapProdus.get(numeProdus).cresteStoc((int)mapProdus.get(numeProdus).getStoc());
       }
        else {
            //cream un ob de tipul clasei
            Produs produs=new Produs(stoc,numeProdus);
            //adaugam in  Map numele
            mapProdus.put(numeProdus,produs);
        }
       return mapProdus.get(numeProdus);
    }
    // clasa implementeaza Interfata  si   rescriem metodele
    @Override
    public float getStoc() {
        return this.stoc;
    }

      @Override
    public void afiseazaProdus() {
        final StringBuilder sb = new StringBuilder("Produs{");
        sb.append("stoc=").append(stoc);
        sb.append(", numeProdus='").append(numeProdus).append('\'');
        sb.append('}');
        System.out.println(sb);;
    }

    @Override
    public String getNumeProdus() {
        return this.numeProdus;
    }

    @Override
    public void cresteStoc(int nrProduse) {
        this.stoc+=nrProduse;
    }

}
