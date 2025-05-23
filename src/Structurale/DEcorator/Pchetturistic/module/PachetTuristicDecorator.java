package Structurale.DEcorator.Pchetturistic.module;

public abstract class PachetTuristicDecorator implements PachetTuristic{
//atribut un ob de tipul Pachet Turistic
    protected PachetTuristic pachet;

    public PachetTuristicDecorator(PachetTuristic pachet) {
        this.pachet = pachet;
    }

    public PachetTuristic getPachet() {
        return pachet;
    }

    @Override
    public void rezervaPachetul() {
        this.pachet.rezervaPachetul();
    }
    //functionalitate noua
    public abstract void anuleazarezervare();

}
