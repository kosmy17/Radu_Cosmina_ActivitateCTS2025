package Structurale.Composite.BancaS9.module;

import java.sql.SQLOutput;

public class Filiala implements IAgentie{
    private String denumire;

    public Filiala(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaNod(IAgentie agentie) throws Exception {
        throw new Exception( "Acesta  este un nod frunza.");
    }

    @Override
    public void stergeNod(IAgentie agentie) throws Exception {
        throw new Exception( "Acesta  este un nod frunza.");
    }

    @Override
    public void getNod(int index) throws Exception {
        throw new Exception( "Acesta  este un nod frunza.");
    }

    @Override
    public void descriere() {
        System.out.println(" Filiala: "+this.denumire);
    }
}
