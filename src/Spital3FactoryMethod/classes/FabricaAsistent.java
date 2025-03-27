package Spital3FactoryMethod.classes;

public class FabricaAsistent implements Ifabrica{
    @Override
    public FamiliaPersonalSpital creaza() {
        return new Asistent();
    }
}
