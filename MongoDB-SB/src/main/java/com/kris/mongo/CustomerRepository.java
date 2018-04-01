package com.kris.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface CustomerRepository extends MongoRepository<Customer,String>{
	
	public Customer findByFirstname(String firstname);
	
	public List<Customer> findByLastname(String lastname);

}
