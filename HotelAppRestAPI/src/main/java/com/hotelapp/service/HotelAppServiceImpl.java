package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.dao.HotelAppDAO;
import com.hotelapp.model.Hotel;

@Service

public class HotelAppServiceImpl implements HotelAppService{
	@Autowired
	HotelAppDAO hotelAppDao;
	
	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelAppDao.getAllHotels();
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		return hotelAppDao.getByCity(city);
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		return hotelAppDao.getByCuisine(cuisine);
	}

	@Override
	public Hotel getById(int id) {
		// TODO Auto-generated method stub
		return hotelAppDao.getById(id);
	}

}
