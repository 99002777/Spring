package com.lts.Vehicle;

import org.springframework.stereotype.Component;

@Component
public class Car implements MileCalculator{

	@Override
	public void showMileage(int x) {
		// TODO Auto-generated method stub
		System.out.println("Car"+x);
	}

}
