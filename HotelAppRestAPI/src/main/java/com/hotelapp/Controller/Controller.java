package com.hotelapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelAppService;
@RestController
public class Controller {
	@Autowired
	HotelAppService hotelAppService;
	
	@GetMapping("/hotels")
	public List<Hotel> showAllHotels(){
		return hotelAppService.getAllHotels();
	}
	
	@GetMapping("/hotels-by-city/{city}")
	public List<Hotel> showHotelByCity(@PathVariable("city")String city){
		return hotelAppService.getByCity(city);
			
		}
	@GetMapping("/hotels-by-cuisine/{cuisine}")
	public List<Hotel> showHotelByCuisine(@PathVariable("cuisine")String cuisine){
		return hotelAppService.getByCuisine(cuisine);
			
		}
	
	@GetMapping("/hotels-by-Id/{hotelId}")
	public Hotel showHotelById(@PathVariable("hotelId")int id){
		return hotelAppService.getById(id);
			
		}
	
	
	
	}
	
	

