public class CoffeeShop {
   public static void main(String[] args) {
      Beverage beverage = new Espresso();
      System.out.println(beverage.getDescription() + " $" + beverage.cost());

      Beverage beverage2 = new ColdBrew();
      beverage2 = new Mocha(beverage2);
      System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

      Beverage beverage3 = new Espresso();
      beverage3 = new Mocha(beverage3);
      beverage3 = new Whip(beverage3);
      System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
   }
}
