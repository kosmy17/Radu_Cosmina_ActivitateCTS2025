package Structurale.Strategy.ModululPLata.module;

public class PlataCash implements Iplata{
    @Override
    public void plateste(String nume, double sumaPlatita) {
        System.out.println("S-a  facut plata n valoare de  "+sumaPlatita +" cash  de catre "+nume);
    }
}
