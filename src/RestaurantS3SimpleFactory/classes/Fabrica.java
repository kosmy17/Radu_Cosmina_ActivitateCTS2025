package RestaurantS3SimpleFactory.classes;

public class Fabrica {
    //cream o  metoda  publica de tipul interfetei  cu param  Enum
    //functia switch
    public FamiliaSupelor creaza (TipSupa tip) throws Exception {
        switch (tip){
            case supaCiuperci:return new supaCiuperci();
            case supaVita:return new supaVita();
            case supaLegume:return new supaLegume();
            default:throw new Exception("tipul ales nu este valid");
        }
    }
}
