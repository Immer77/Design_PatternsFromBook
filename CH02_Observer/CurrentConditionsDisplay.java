package CH02_Observer;

// Implementere observer interfacet så den kan få ændringer fra weatherdata objektet og display interfacet da den så kan vise alle
// de nødvendige informationer den får givet.
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private double temperature;
    private double humidity;
    private WeatherData weatherData;

    // Constructor som når den bliver oprettet bliver den tilføjet til observers på subjektet weatherdata
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + " humidity");
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        display();
    }
}
