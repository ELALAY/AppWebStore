package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;

@Repository
public class inMemoryCustomerRepository implements CustomerRepository {
	private List<Customer> listOfCustomers = new ArrayList<Customer>();

	public inMemoryCustomerRepository() {
		Customer first = new Customer();
		first.setName("Nick");
		first.setAddress("222 Road St.");
		first.setNoOfOrdersMade(5);
		first.setCustomerId("10001");
		
		Customer second = new Customer("Ben", "111 Beard Ln.");
		second.setCustomerId("10002");
		second.setNoOfOrdersMade(11);
		
		Customer third = new Customer("Erin", "1324 Get Dolled Way");
		third.setCustomerId("10003");
		third.setNoOfOrdersMade(100);

		listOfCustomers.add(first);
		listOfCustomers.add(second);
		listOfCustomers.add(third);

	}
	
	public List<Customer> getAllCustomers() {
		return listOfCustomers;
	}
}