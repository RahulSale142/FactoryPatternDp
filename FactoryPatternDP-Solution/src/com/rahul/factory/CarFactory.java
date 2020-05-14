package com.rahul.factory;

import com.rahul.tyre.AppoloTyre;
import com.rahul.tyre.MRFTyre;
import com.rahul.tyre.MichelinTyre;
import com.rahul.tyre.Tyre;
import com.rahul.vehicle.Car;
import com.rahul.vehicle.LuxoryCar;
import com.rahul.vehicle.SportCar;
import com.rahul.vehicle.StandardCar;

public class CarFactory {
	public static Car getCarInstance(String carType) {
		Car car = null;
		Tyre tyre = null;
		
		if(carType.equalsIgnoreCase(CarType.TYPE_STANDARD)) {
			tyre = new AppoloTyre();
			car = new StandardCar(tyre);
		} else if(carType.equalsIgnoreCase(CarType.TYPE_LUXORY)) {
			tyre = new MichelinTyre();
			car = new LuxoryCar(tyre);
		} else if(carType.equalsIgnoreCase(CarType.TYPE_SPORT)) {
			tyre =new MRFTyre();
			car = new SportCar(tyre);
		} else
			throw new IllegalArgumentException("Invalid car type");
		
		return car;
	}

}
