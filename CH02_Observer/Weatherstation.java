package CH02_Observer;

public class Weatherstation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData);


        weatherData.setMeasurements(20,20,20);
        weatherData.setMeasurements(30,30,30);
        weatherData.setMeasurements(123,123,12);

        statisticsDisplay.display();
        thirdPartyDisplay.display();
        currentConditionsDisplay.display();


    }
}
