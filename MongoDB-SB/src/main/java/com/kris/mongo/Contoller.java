package com.kris.mongo;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contoller {
	
	@Resource
	private CustomerRepository repository;
	
	@RequestMapping(value="/getCustByFN",method=RequestMethod.GET)
	public Customer getCustomerByFirstName(String name)
	{
		return repository.findByFirstname(name);
	}
	
	@RequestMapping(value="/addCust",method=RequestMethod.POST)
	public String addCustomer(String firstname,String lastname)
	{
		try
		{
			repository.save(new Customer(firstname,lastname));
		}
		catch(Exception e)
		{
			String.format("Data not saved with provided %s", e.getMessage());
		}
		return String.format("Data saved Successfully with provided FN: %s and LN: %s", firstname,lastname);
		 
	}
	
	@RequestMapping(value="/getCustByLN",method=RequestMethod.GET,produces={"application/json"})
	public ResponseWrapper getCustomersByLastName(String lastname)
	{
		List<Customer> custList = repository.findByLastname(lastname);
		ResponseWrapper rp = new ResponseWrapper();
		rp.setCustomerlist(custList);
		return rp;
	}
	

}
