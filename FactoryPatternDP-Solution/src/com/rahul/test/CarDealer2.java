package com.rahul.test;

import com.rahul.factory.CarFactory;
import com.rahul.tyre.MRFTyre;
import com.rahul.tyre.MichelinTyre;
import com.rahul.tyre.Tyre;
import com.rahul.vehicle.Car;
import com.rahul.vehicle.LuxoryCar;
import com.rahul.vehicle.SportCar;

public class CarDealer2 {

	public static void main(String[] args) {
		System.out.println("sport car dealer");
		
		Car car = null;
		
		car = CarFactory.getCarInstance("luxory");
		car.roadTest();
	}

}
