package PachetTuristicFactoryMethod.classes;

public class FabricaCazarePachet implements  Ifabrica{
    @Override
    public FamiliaPachetTuristic creaza() {
        return new CazarePachet();
    }
}
