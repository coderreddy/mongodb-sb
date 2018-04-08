package com.kris.mongo;

public class Address {
	
	private String streetname;
	
	private String city;
	
	private String state;

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return String.format("{\"StreetName\" : \"%s\", \"City\" : \"%s\", \"State\" : \"%s\"}", streetname,city,state);
	}
	
	

}
