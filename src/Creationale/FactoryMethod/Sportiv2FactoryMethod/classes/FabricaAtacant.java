package Creationale.FactoryMethod.Sportiv2FactoryMethod.classes;

public class FabricaAtacant  implements Ifabrica{
    @Override
    public FamiliaJucator creeaza() {
        return new Atacant();
    }
}
