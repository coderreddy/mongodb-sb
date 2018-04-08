package com.kris.mongo;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Resource
	private CustomerRepository repository;
	
	@Resource
	public MongoTemplate mongoTemplate;
	
	public Controller(MongoTemplate mongoTemplate)
	{
		this.mongoTemplate = mongoTemplate;
	}
	
	@RequestMapping(value="/getCustByFN",method=RequestMethod.GET)
	public Customer getCustomerByFirstName(String name)
	{
		return repository.findByFirstname(name);
	}
	
	@RequestMapping(value="/addCust",method=RequestMethod.POST)
	public String addCustomer(@RequestBody(required=true) Customer cust)
	{
		try{
			mongoTemplate.save(cust,"customer_table");
		}
		catch(Exception e)
		{
			return String.format("Data not saved because of exception %s", e.getMessage());
		}
			return "Data saved Successfully with provided values";
	}
	
	@RequestMapping(value="/getCustByLN",method=RequestMethod.GET,produces={"application/json"})
	public ResponseWrapper getCustomersByLastName(String lastname)
	{
		//Query query = new Query(Criteria.where("lastname").is(lastname));
		//List<Customer> custList = mongoTemplate.find(query, Customer.class);
		List<Customer> custList = repository.findByLastname(lastname);
		ResponseWrapper rp = new ResponseWrapper();
		rp.setCustomerlist(custList);
		return rp;
	}
	

}
