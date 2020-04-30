package com.example.smshub.service;

import java.util.List;

import com.example.smshub.model.Lcr;
import com.example.smshub.model.LcrDto;
import com.example.smshub.model.User;
import com.example.smshub.model.UserDto;

public interface LcrService {

	Lcr save(LcrDto lcr_data);
	List<Lcr> findAll();
	
	void delete(int id);

    Lcr findOne(String lcr_name);

    Lcr findById(int lcr_policy_id);

    LcrDto update(LcrDto lcrDto);
}
