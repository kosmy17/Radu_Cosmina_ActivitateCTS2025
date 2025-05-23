package Structurale.DEcorator.SpitalS1Mare.module;

public abstract class IspitalDecorator implements ISpital {
    protected ISpital spital;

    public IspitalDecorator(ISpital spital) {
        this.spital = spital;
    }



    public abstract void accesSalonEchipati(Vizitator vizitator);


    @Override
    public void accesSalon(Vizitator vizitator) {
        spital.accesSalon(vizitator);
    }
}
