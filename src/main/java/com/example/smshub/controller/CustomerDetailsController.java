package com.example.smshub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smshub.model.ApiResponse;
import com.example.smshub.model.CustomerDetails;
import com.example.smshub.service.CustomerDetailsService;

@RestController
@RequestMapping

public class CustomerDetailsController {
	
	@Autowired
	private CustomerDetailsService service;

	@GetMapping("/customer")
	@CrossOrigin//(origins = "http://localhost:3000/")
    public ApiResponse<List<CustomerDetails>> listCustomer(){
    	return new ApiResponse<>(HttpStatus.OK.value(), "Customers fetched successfully", service.findAllCustomers());
    }
	
	@GetMapping("/supplier")
	@CrossOrigin
	public ApiResponse<List<CustomerDetails>> listSupplier(){
    	return new ApiResponse<>(HttpStatus.OK.value(), "Customers fetched successfully", service.findAllSuppliers());
    }
	
	@GetMapping("/SMPPsupplier")
	@CrossOrigin
	public ApiResponse<List<CustomerDetails>> listSMPPSupplier(){
    	return new ApiResponse<>(HttpStatus.OK.value(), "Customers fetched successfully", service.findAllSMPPSuppliers());
    }
}