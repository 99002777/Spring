package com.lts.jbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.lts.autowiring.Rectangle;
import com.lts.autowiring.Shape;
import com.lts.autowiring.ShapeFactory;
import com.lts.autowiring.Triangle;

@Configuration
public class AppConfig {
	@Bean
	public Shape getTriangle() {
		return new Triangle();
	}
	@Bean
	public Vehicle getVehicle() {
		return new Vehicle();
	}
	@Bean

	public  Shape getRectangle() {
		return new Rectangle();
	}
	@Bean
	public ShapeFactory getFactory() {
		return new ShapeFactory();
	}

}
