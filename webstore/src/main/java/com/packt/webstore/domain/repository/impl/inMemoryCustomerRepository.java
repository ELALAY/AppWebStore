package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;

@Repository
public class inMemoryCustomerRepository implements CustomerRepository{
	private List<Customer> listOfCustomers = new ArrayList<Customer>();
	
	public inMemoryCustomerRepository() {
		Customer c1 = new Customer("Aymane", "475, Rabat");
		c1.setCustomerId("10001");
		c1.setCustomerNoOfOrdersMade(301);
		
		Customer c2 = new Customer("nada", "marrakech");
		c2.setCustomerId("10002");
		c2.setCustomerNoOfOrdersMade(750);
		
		listOfCustomers.add(c1);
		listOfCustomers.add(c2);
	}
	
	public List<Customer> getAllCustomers() {
		return listOfCustomers;
	}
}
