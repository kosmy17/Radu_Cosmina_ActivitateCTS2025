package Structurale.DEcorator.BancaS6.module;

public class PlataDecorat extends PlataDecorator{

    public PlataDecorat(Iplata plata) {
        super(plata);
    }

    @Override
    public void platesteContactless() {
        System.out.println("S-a   facut plata  cntactless.");
    }
}
