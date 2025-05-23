package Structurale.DEcorator.BancaS6.module;

public abstract class PlataDecorator implements Iplata{
    protected Iplata plata;

    public PlataDecorator(Iplata plata) {
        this.plata = plata;
    }

    @Override
    public void platesteNormalcuCardul() {
        plata.platesteNormalcuCardul();
    }

    @Override
    public void platesteOnline() {
        plata.platesteOnline();
    }

    //metoda  extra
    public abstract void platesteContactless();

}
