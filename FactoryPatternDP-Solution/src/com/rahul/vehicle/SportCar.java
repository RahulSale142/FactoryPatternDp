package com.rahul.vehicle;

import com.rahul.tyre.Tyre;

public class SportCar implements Car {

	private Tyre tyre = null;
	
	public SportCar(Tyre tyre) {
		System.out.println("SportCar.SportCar()");
		this.tyre= tyre;
	}
	
	@Override
	public void roadTest() {
		System.out.println("Driving sport car having :"+ tyre.info());
	}

}
