package Creationale.FactoryMethod.Spital3FactoryMethod.classes;

public class FabricaMedic implements Ifabrica{
    @Override
    public FamiliaPersonalSpital creaza() {
        return new Medic();
    }
}
