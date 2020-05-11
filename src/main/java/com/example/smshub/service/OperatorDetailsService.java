package com.example.smshub.service;

import java.util.List;

import com.example.smshub.model.CustomerDetails;
import com.example.smshub.model.OperatorDetails;
import com.example.smshub.model.OperatorDetailsDto;


public interface OperatorDetailsService {
	
//	OperatorDetails save(OperatorDetailsDto opdata);
//	List<OperatorDetails> findAll();
//    void delete(int operator_id);
//
//    
//
//    OperatorDetails findById(int operator_id);
//
//    OperatorDetailsDto update(OperatorDetailsDto opdata);
	

	List<OperatorDetails> findAllOperators();

}
