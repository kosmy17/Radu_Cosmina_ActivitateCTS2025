package Structurale.Strategy.ModululPLata.module;

public class PlataCard implements Iplata{
    @Override
    public void plateste(String nume, double sumaPlatita) {
        System.out.println("S-a  facut plata n valoare de  "+sumaPlatita +" prin Card  de catre "+nume);
    }
}
