package Structurale.Composite.BancaS9.main;

import Structurale.Composite.BancaS9.module.Agentie;
import Structurale.Composite.BancaS9.module.Filiala;
import Structurale.Composite.BancaS9.module.IAgentie;

public class Main {
    public static void main(String[] args) throws Exception {
        //cream obiecte
        IAgentie agentie1=new Agentie("Agentie1");
        IAgentie agentie2=new Agentie ("Agentie2");
        IAgentie agentie3=new Agentie ("Agentie3");
        IAgentie filiala1=new Filiala("Filiala1");
        IAgentie filiala2=new Filiala("Filiala2");
        IAgentie filiala3=new Filiala("Filiala4");
        IAgentie filiala4=new Filiala("Filiala5");
        IAgentie filiala5=new Filiala("Filiala6");
        IAgentie filiala6=new Filiala("Filiala7");
        IAgentie filiala7=new Filiala("Filiala8");

        agentie1.adaugaNod(filiala1);
        agentie1.adaugaNod(filiala2);
        agentie1.adaugaNod(filiala3);
        agentie2.adaugaNod(filiala4);
        agentie3.adaugaNod(filiala5);
        agentie3.adaugaNod(filiala6);
        agentie3.adaugaNod(filiala7);


        agentie1.descriere();
        agentie2.descriere();
        agentie3.descriere();

    }
}
