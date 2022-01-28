package creational.abstract_factory;

public class CrediteSuisse implements Bank{
    private final String bankName;
    public CrediteSuisse(){
        bankName="Credite Suisse";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
