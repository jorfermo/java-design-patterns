package behavioral.observer;

public class CurrentConditions implements Observer, Display {
   private float temperature;
   private float humidity;

   public CurrentConditions(WeatherData weatherData) {
      weatherData.registerObserver(this);
   }

   public void update(float temperature, float humidity, float pressure) {
      this.temperature = temperature;
      this.humidity = humidity;
      display();
   }

   public void display() {
      System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
   }
}
