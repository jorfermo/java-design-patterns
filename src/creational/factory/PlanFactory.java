package creational.factory;

public class PlanFactory {
    public Plan getPlan(Plan.Type planType){
        switch(planType){
            case DOMESTIC -> {
                return new DomesticPlan();
            }
            case INSTITUTIONAL -> {
                return new InstitutionalPlan();
            }
            case COMMERCIAL -> {
                return new CommercialPlan();
            }
            default -> {
                return null;
            }
        }
    }
}
