package com.lts.autowiring;

import org.springframework.stereotype.Component;

//@Component("nshape")
public class Triangle implements Shape{

	@Override
	public void calculateArea(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("triang"+0.5*x*y);
	}

}
