package com.example.smshub.service;

import java.util.List;

import com.example.smshub.model.CustomerDetails;

public interface CustomerDetailsService {
//	log.info("Fetching all customers");
	
//	List<CustomerDetails> findAll();
	
	List<CustomerDetails> findAllCustomers();
	
	List<CustomerDetails> findAllSuppliers();
	
	List<CustomerDetails> findAllSMPPSuppliers();
} 