package com.rahul.test;

import com.rahul.tyre.MichelinTyre;
import com.rahul.tyre.Tyre;
import com.rahul.vehicle.Car;
import com.rahul.vehicle.LuxoryCar;

public class CarDealer1 {

	public static void main(String[] args) {
		System.out.println("Luxory car dealer");
		Tyre tyre = null;
		Car car = null;
		
		tyre = new MichelinTyre();
		car = new LuxoryCar(tyre);
		car.roadTest();
	}

}
