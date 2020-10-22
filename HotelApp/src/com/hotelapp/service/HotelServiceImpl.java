package com.hotelapp.service;

import java.util.List;

import com.hotelapp.dao.HotelDAO;
import com.hotelapp.dao.HotelDAOImpl;
import com.hotelapp.model.Hotel;

public class HotelServiceImpl implements HotelService {
	
	HotelDAO hotelDAo=new HotelDAOImpl();

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelDAo.getAllHotels();
	}

	@Override
	public Hotel getById(int id) {
		// TODO Auto-generated method stub
		return hotelDAo.getById(id);
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		return hotelDAo.getByCity(city);
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		return hotelDAo.getByCuisine(cuisine);
	}

}
