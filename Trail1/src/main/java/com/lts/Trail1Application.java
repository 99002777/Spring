package com.lts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.autowiring.ShapeFactory;
import com.lts.jbased.Vehicle;
import com.lts.setter.Employee;

@SpringBootApplication
public class Trail1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Trail1Application.class, args);
	}
	@Autowired
	ApplicationContext context;
	@Override
	public void run(String... args) throws Exception {
	/*	Employee employee1=context.getBean("employee",Employee.class);
		System.out.println(employee1);
		
		Employee employee2=context.getBean("employee",Employee.class);
		System.out.println(employee2);
		employee2.setName("Kumar");
		System.out.println("emp1"+employee1);
		System.out.println("emp2"+employee2);
		
		Vehicle vehicle=context.getBean("vehicle",Vehicle.class);
		System.out.println(vehicle);*/
		
//		Student student=context.getBean("student",Student.class);
//		System.out.println(student);
//		
		ShapeFactory shapeFactory=context.getBean(ShapeFactory.class);
		shapeFactory.printArea(20, 10);
		
	//	FoodPanda foodPanda=context.getBean("foodPanda",FoodPanda.class);
	//	foodPanda.showMenu("Indian");
	}
	
	
	
	

}
