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
		c1.setCustomerId("001");
		c1.setCustomerNoOfOrdersMade(301);
		
		Customer c2 = new Customer("Nada", "Marrakech");
		c2.setCustomerId("002");
		c2.setCustomerNoOfOrdersMade(750);
		
		listOfCustomers.add(c1);
		listOfCustomers.add(c2);
	}
	
	public List<Customer> getAllCustomers() {
		return listOfCustomers;
	}
	
	public Customer getCustomerById(String customerId) {
		Customer customerById = null;
		
		for(Customer customer : listOfCustomers) {
			if(customer!=null && customer.getCustomerId()!=null && customer.getCustomerId().equals(customerId)){
				customerById = customer;
				break;
			}
		}
		
		if(customerById == null){
			throw new IllegalArgumentException("No products found with the product id: "+ customerId);
		}
		
		return customerById;
	}
	
}
