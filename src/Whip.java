public class Whip extends CondimentDecorator {
   public Whip(Beverage beverage) {
      this.beverage = beverage;
   }

   public double cost() {
      return 0.35 + beverage.cost();
   }

   public String getDescription() {
      return beverage.getDescription() + " with Whip";
   }
}
