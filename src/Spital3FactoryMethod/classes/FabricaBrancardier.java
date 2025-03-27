package Spital3FactoryMethod.classes;

public class FabricaBrancardier implements Ifabrica{
    @Override
    public FamiliaPersonalSpital creaza() {
        return new Brancardier();
    }
}
