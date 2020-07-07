package observer_pattern.substance;

import observer_pattern.template.DisplayElement;
import observer_pattern.template.Observer;
import observer_pattern.template.Subject;
import observer_pattern.template.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void cancelSubscribe(Subject weatherData) {
        weatherData.removeObserver(this);
    }

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);

        currentConditionsDisplay.cancelSubscribe(weatherData);

        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
