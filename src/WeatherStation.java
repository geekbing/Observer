import observer.CurrentConditionsDisplay;
import observer.ForecastDisplay;
import observer.HeatIndexDisplay;
import observer.StatisticsDisplay;
import subject.WeatherData;

/**
 * Author: bing
 * Date: 2017-03-02 16:21
 * Email: dhuzbb@163.com
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
