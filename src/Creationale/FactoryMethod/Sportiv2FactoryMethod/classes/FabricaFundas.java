package Creationale.FactoryMethod.Sportiv2FactoryMethod.classes;

public class FabricaFundas implements Ifabrica{
    @Override
    public FamiliaJucator creeaza() {
        return new Fundas();
    }
}
