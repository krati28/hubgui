package com.example.smshub.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.smshub.model.OperatorDetails;

public interface OperatorDetailsDao extends CrudRepository<OperatorDetails, Integer> {
	

	@Query(value ="select * from op_details ", nativeQuery=true)
	List<OperatorDetails> findAllOperators();

}
