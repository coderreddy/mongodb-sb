package com.kris.mongo;

public class Customer {
	
	private String id;
	
	private String firstname;
	
	private String lastname;
	
	public Customer(String firstname,String lastname)
	{
		this.firstname = firstname;
		this.lastname = lastname;
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
		return String.format("{\"FirstName\" : \"%s\", \"LastName\" : \"%s\"}", firstname,lastname);
	}
	
	

}