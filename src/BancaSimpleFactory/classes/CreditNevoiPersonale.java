package BancaSimpleFactory.classes;

public class CreditNevoiPersonale  implements FamiliaCreditelor{
    @Override
    public void descriere() {
        System.out.println("Acesta este un credit de nevoi personale.");
    }
}
