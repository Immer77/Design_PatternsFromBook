package CH02_Observer;

public class ThirdPartyDisplay implements Observer,DisplayElement{
    private double temperature;
    private double humidity;
    private WeatherData weatherData;

    public ThirdPartyDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + " humidity");
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}