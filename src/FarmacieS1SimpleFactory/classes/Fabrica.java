package FarmacieS1SimpleFactory.classes;

public class Fabrica {
    //cream o met  publica de tipul interfetei cu param Enum
    public FamiliaMedicamentelor creaza (TipcategorieMedicament tip) throws Exception {
        switch (tip){
            case Body:return new Body();
            case Durere:return new Durere();
            case Raceala: return new Raceala();
            default: throw new Exception("Tipul ales nu este  valid.");
        }
    }
}
