package com.example.smshub.service;

import java.util.List;

import com.example.smshub.model.DealDto;
import com.example.smshub.model.DealManagement;

public interface DealService {
	
	DealManagement save(DealDto dto);
	List<DealManagement> findAll();
	void delete(int id);
	
	DealManagement findById(int id);
	
	DealDto update(DealDto deal);
	
}