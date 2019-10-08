package factory;
import factory.*;
import car.*;

public class AodiFactory implements CarFactory{
	public Car createCar(){
		return new Aodi();
		
	}
}