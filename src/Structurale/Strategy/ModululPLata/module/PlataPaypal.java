package Structurale.Strategy.ModululPLata.module;

public class PlataPaypal implements Iplata {
    @Override
    public void plateste(String nume, double sumaPlatita) {
        System.out.println("S-a  facut plata n valoare de  "+sumaPlatita +" prin pay pal  de catre "+nume);
    }
}
