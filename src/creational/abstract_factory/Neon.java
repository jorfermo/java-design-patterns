package creational.abstract_factory;

public class Neon implements Bank{
    private final String bankName;
    public Neon(){
        bankName="Neon";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
