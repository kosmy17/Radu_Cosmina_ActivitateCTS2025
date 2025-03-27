package PachetTuristicFactoryMethod.classes;

public class FabricaAllInclusivePachet implements Ifabrica{
    @Override
    public FamiliaPachetTuristic creaza() {
        return new AllinclusivePachet();
    }
}
