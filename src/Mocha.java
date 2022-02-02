public class Mocha extends CondimentDecorator {

   public Mocha(Beverage beverage) {
      this.beverage = beverage;
   }

   public double cost() {
      return 0.20 + beverage.cost();
   }

   public String getDescription() {
      return beverage.getDescription() + " with Mocha";
   }

}
