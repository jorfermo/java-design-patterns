package creational.factory;

public abstract class Plan {
    public enum Type {
        COMMERCIAL,
        DOMESTIC,
        INSTITUTIONAL
    }

    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units * rate);
    }
}
