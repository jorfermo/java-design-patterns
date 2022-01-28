package creational.abstract_factory;

public class LoanFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        switch (loan){
            case("Home") -> {
                return new HomeLoan();
            }
            case("Business") -> {
                return new BussinessLoan();
            }
            case("Education") -> {
                return new EducationLoan();
            }
            default -> {
                return null;
            }
        }
    }

}
