package creational.abstract_factory;

public class BankFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bank) {
        switch (bank){
            case("Creditte Suisse") -> {
                return new CrediteSuisse();
            }
            case("Neon") -> {
                return new Neon();
            }
            default -> {
                return null;
            }
        }
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
