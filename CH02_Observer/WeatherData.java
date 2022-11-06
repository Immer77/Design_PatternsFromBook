package CH02_Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    // List med alle de observers der lytter på dette subjekt
    private List<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;


    public WeatherData(){
        observers = new ArrayList<>();
    }

    // Metoder der bliver implementeret

    /**
     * Registrer en observer og tilføjer den til listen af observers
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        if(!observers.contains(o)){
            observers.add(o);
        }

    }

    /**
     * Fjerner en observer hvis de ikke længere gider at ligge på objektet
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)){
            observers.remove(o);
        }
    }

    /**
     * Giver alle Observers besked og updatere
     */
    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(temperature,humidity,pressure);
        }
    }

    /**
     * Hvis der er foretaget nogle ændringer på de 3 field attributer
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    /**
     * Ændrer de forskellige measurements og sikrer sig at efter det er gjort får observers opdateret inforamtionen
     * @param temperature
     * @param humidity
     * @param pressure
     */

    public void setMeasurements(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
