package com.rahul.test;

import com.rahul.factory.CarFactory;
import com.rahul.tyre.MichelinTyre;
import com.rahul.tyre.Tyre;
import com.rahul.vehicle.Car;
import com.rahul.vehicle.LuxoryCar;

public class CarDealer1 {

	public static void main(String[] args) {
		System.out.println("CarDealer1.main()");
		System.out.println("Sports car dealer");
		Car car = null;
		//get instance
		car= CarFactory.getCarInstance("sport");
		
		car.roadTest();
	}

}
