package Structurale.DEcorator.Pchetturistic.module;

public class PachetCazareDecorator extends PachetTuristicDecorator {
    //mosteneste Pachest turristic Decorator
    public PachetCazareDecorator(PachetTuristic pachet) {
        super(pachet);
    }

    @Override
    public void anuleazarezervare() {
        System.out.println("S-a anulat pachetul cu destinatia "+((ClasaconcretaCazare)pachet).getDestinatie());
    }


}
