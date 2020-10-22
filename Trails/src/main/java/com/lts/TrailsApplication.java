package com.lts;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.lts.Vehicle.VehicleDetails;

 

@SpringBootApplication
public class TrailsApplication implements CommandLineRunner {

 

    public static void main(String[] args) {
        SpringApplication.run(TrailsApplication.class, args);
    }
    @Autowired
    ApplicationContext context;

 

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        VehicleDetails vechileDetails=context.getBean(VehicleDetails.class);
        vechileDetails.getMileage("car");
        vechileDetails.getMileage("bike");
    }

 

}
 
 
