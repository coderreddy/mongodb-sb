package com.kris.mongo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Customer_Table")
public class Customer {
	
	private String id;
	
	private String firstname;
	
	private String lastname;
	
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		return String.format("{\"FirstName\" : \"%s\", \"LastName\" : \"%s\", \"Address\" : \"%s\"}", firstname,lastname,address.toString());
	}
	
	

}
