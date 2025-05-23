package Structurale.Composite.BancaS9.module;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements IAgentie{
  private String denumire;
  private List <IAgentie> listaAgentii=new ArrayList<>();

    public Agentie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaNod(IAgentie agentie) {
        listaAgentii.add(agentie);
    }

    @Override
    public void stergeNod(IAgentie agentie) {
        listaAgentii.remove(agentie);
    }

    @Override
    public void getNod(int index) {
        listaAgentii.get(index);
    }

    @Override
    public void descriere() {
        System.out.println(" Agentie: "+ this.denumire);
        for (var elem: listaAgentii){
            elem.descriere();
        }
    }
}
