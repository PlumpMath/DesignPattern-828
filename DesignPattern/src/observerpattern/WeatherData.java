package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject
{
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData()
	{
		observers=new ArrayList<>();
	}
	public void registerObserver(Observer o)
	{
		this.observers.add(o);
	}
	public void removeObserver(Observer o)
	{
		int i=observers.indexOf(o);
		if(i>=0)
		{
			observers.remove(i);
		}
	}
	public void notifyObservers()
	{
		for(Observer o:observers)
		{
			o.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementChanged()
	{
		notifyObservers();
	}
	
	public void setMeasurements(float temp,float humi,float press)
	{
		this.temperature=temp;
		this.humidity=humi;
		this.pressure=press;
		measurementChanged();
	}
	
}
