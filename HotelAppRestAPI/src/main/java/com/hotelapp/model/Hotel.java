package com.hotelapp.model;

public class Hotel {
	Integer hotelId;
	String city;
	String hotelName;
	String cuisine;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(Integer hotelId, String city, String hotelName, String cuisine) {
		super();
		this.hotelId = hotelId;
		this.city = city;
		this.hotelName = hotelName;
		this.cuisine = cuisine;
	}
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", city=" + city + ", hotelName=" + hotelName + ", cuisine=" + cuisine
				+ "]";
	}
	

}
