package Structurale.DEcorator.SpitalS1Mare.module;

import java.util.ArrayList;
import java.util.List;

public class SpitalDecorat extends IspitalDecorator{
    private List<Vizitator> vizitatori;


    public SpitalDecorat(ISpital spital, List<Vizitator> vizitatori) {
        super(spital);
        this.vizitatori = vizitatori;
    }

    public SpitalDecorat(ISpital spital) {
        super(spital);
    }


    @Override
    public void accesSalonEchipati(Vizitator vizitator ) {
       vizitatori.add(vizitator);
       if (vizitatori.size()>=5){
           System.out.println("Se  echipeaza vizitatorii si au acces in salon.");
       }
       else{
           System.out.println("Mai putini  vizitatori.");
       }
    }
}
