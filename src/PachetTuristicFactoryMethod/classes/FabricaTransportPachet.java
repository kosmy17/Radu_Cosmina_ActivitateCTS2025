package PachetTuristicFactoryMethod.classes;

public class FabricaTransportPachet implements Ifabrica{
    @Override
    public FamiliaPachetTuristic creaza() {
        return new TransportPachet();
    }
}
