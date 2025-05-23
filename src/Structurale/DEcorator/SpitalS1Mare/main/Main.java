package Structurale.DEcorator.SpitalS1Mare.main;

import Structurale.DEcorator.SpitalS1Mare.module.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> sectii=new ArrayList<>();
        sectii.add("chirurgie");
        sectii.add("neurologie");
        List<Vizitator> vizitatori=new ArrayList<>();
        Vizitator vizitator1=new Vizitator("nume1",25,true);
        Vizitator vizitator2=new Vizitator("nume2",25,false);
        Vizitator vizitator3=new Vizitator("nume3",25,true);
        Vizitator vizitator4=new Vizitator("nume4",25,true);
        Vizitator vizitator5=new Vizitator("nume5",25,true);
        Vizitator vizitator6=new Vizitator("nume6",25,true);
        Vizitator vizitator7=new Vizitator("nume7",25,true);
        vizitatori.add(vizitator1);
        vizitatori.add(vizitator2);
        vizitatori.add(vizitator3);
        vizitatori.add(vizitator4);
        vizitatori.add(vizitator5);
        vizitatori.add(vizitator6);
        vizitatori.add(vizitator7);

        ISpital spital=new Spital(sectii, "Urgenta");
        spital.accesSalon(vizitator1);
        IspitalDecorator spitalDecorator=new SpitalDecorat(spital,vizitatori);
        spitalDecorator.accesSalonEchipati(vizitator1);
        spitalDecorator.accesSalon(vizitator1);
    }
}
