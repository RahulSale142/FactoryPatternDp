package com.rahul.vehicle;

import com.rahul.tyre.Tyre;

public class LuxoryCar implements Car {

	private Tyre tyre = null;
	
	public LuxoryCar(Tyre tyre) {
		System.out.println("LuxoryCar.LuxoryCar()");
		this.tyre= tyre;
	}
	
	@Override
	public void roadTest() {
		System.out.println("Driving luxory car having :"+ tyre.info());
	}

}
