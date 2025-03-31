package Sportiv2FactoryMethod.classes;

public class FabricaPortar implements Ifabrica{
    @Override
    public FamiliaJucator creeaza() {
        return new Portar();
    }
}
