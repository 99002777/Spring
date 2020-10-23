package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelapp.model.Hotel;
@Service
public class HotelAppDAOImpl implements HotelAppDAO{

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return showHotelList();
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList=new ArrayList<>();
		for(Hotel hotel:showHotelList()) {
			if(hotel.getCity().equals(city))
				newHotelList.add(hotel);
		}
		return newHotelList;
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList=new ArrayList<>();
		for(Hotel hotel:showHotelList()) {
			if(hotel.getCuisine().equals(cuisine))
				newHotelList.add(hotel);
		}
		return newHotelList;
	}

	@Override
	public Hotel getById(int id) {
		// TODO Auto-generated method stub
		for(Hotel hotel:showHotelList()) {
			if(hotel.getHotelId()==id)
				return hotel;
		}
		return null;
	}
	
	private List<Hotel> showHotelList(){
		return Arrays.asList(
				new Hotel(1,"Karnataka","sree","South"),
				new Hotel(2,"Kerala","sasi","South"),
				new Hotel(3,"hyderabad","srinadh","indian"),
				new Hotel(4,"TPG","sairam","indian")
				);
	}

}
