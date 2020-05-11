package com.example.smshub.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.smshub.model.CustomerDetails;

@Repository
public interface CustomerDetailsdao extends JpaRepository<CustomerDetails, Integer>{
	
	@Query(value ="select * from customer_details where operator_type LIKE 'C' or operator_type LIkE 'C,S' or enterprise LIkE 'Y' ", nativeQuery=true)
	List<CustomerDetails> findAllCustomers();
	
	
	@Query(value="select * from customer_details where operator_type LikE 'S' ", nativeQuery=true )
	List<CustomerDetails> findAllSuppliers();
	
	@Query(value="select * from customer_details where interface_type='SMPP'", nativeQuery=true)
	List<CustomerDetails> findAllSMPPSuppliers();
}