package observerpattern;

import java.util.Observable;
import java.util.Observer;

public class WeatherStation
{
	public static void main(String[] args)throws Exception
	{
		WeatherData weatherData=new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		
	}
}
