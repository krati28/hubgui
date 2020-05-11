package com.example.smshub.service;


import java.util.List;

import com.example.smshub.model.PathDetails;
import com.example.smshub.model.PathDetailsDto;



public interface PathDetailsService {

	PathDetails save(PathDetailsDto path_data);
	List<PathDetails> findAll();
	
	void delete(int id);

	PathDetails findOne(String path_name);

	PathDetails findById(int path_id);

	PathDetailsDto update(PathDetailsDto pathdetailsDto);
}
