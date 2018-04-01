package com.kris.mongo;

import java.util.List;

public class ResponseWrapper {
	
	private List<Customer> customerlist;

	public List<Customer> getCustomerlist() {
		return customerlist;
	}

	public void setCustomerlist(List<Customer> customerlist) {
		this.customerlist = customerlist;
	}

	@Override
	public String toString() {
		
		for(Customer cust : customerlist)
		{
			if(cust != null)
			{
				return String.format("Customer : %s", cust.toString());
			}
		}
		return null;
	}
	
	

}
