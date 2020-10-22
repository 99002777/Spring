package com.lts.Vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class VehicleDetails {
	@Autowired
    @Qualifier("car")
    MileCalculator car;
    @Autowired
    @Qualifier("bike")
    MileCalculator bike;
    public void getMileage(String choice) {
        if(choice.equals("car"))
            car.showMileage(20);
        else
            bike.showMileage(60);
    }
	

}
