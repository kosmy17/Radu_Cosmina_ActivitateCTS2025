package Creationale.Singleton.SingletonRegistry.classes;

import java.util.HashMap;
import java.util.Map;

public class PachetTuristic {
    //dif   fata de  Singletons implu este ca  unicitatea este asigirata de o cheiue
    //  ne folosim de un map
    //declaram atributele
    private String  destinatie;
    private float cost;

    //aplicam cele  3 caract ale SIngeltonului
    //cream un ob de tipul  Clasei - de data  asta un Map cu  stringuri
    private static Map<String,PachetTuristic> mapPachete=new HashMap<>();
    //generam constr  si il facem private

    private PachetTuristic(String destinatie, float cost) {
        this.destinatie = destinatie;
        this.cost = cost;
    }

    //cream metoda public  static synchrinized getInstance (atributele  constructorului)  de tipul clasei
    public static synchronized PachetTuristic getInstance(String  destinatie, float cost) {
        //aici punem o  cheie deca  Map-ul NU contine o amumita cheie -  alegem destiantie
        if (!mapPachete.containsKey(destinatie)) {
            //se creaza un nou pachet
            PachetTuristic pachet = new PachetTuristic(destinatie, cost);
            //punem informatia in maP.putt
            mapPachete.put(destinatie, pachet);
        }
        {
            //else  returnam   cheia
            return mapPachete.get(destinatie);
        }
    }
        //GENERAM un tostrinbg tr afisare


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTuristic{");
        sb.append("destinatie='").append(destinatie).append('\'');
        sb.append(", cost=").append(cost);
        sb.append('}');
        return sb.toString();
    }
}
