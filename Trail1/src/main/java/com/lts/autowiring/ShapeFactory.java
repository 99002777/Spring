package com.lts.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class ShapeFactory {
	@Autowired
	@Qualifier("getRectangle")
	Shape shape;
	
	@Autowired
	@Qualifier("getTriangle")
	Shape nshape;
	
	public void printArea(int x,int y) {
		shape.calculateArea(x, y);
		nshape.calculateArea(x, y);
	}
	

}
