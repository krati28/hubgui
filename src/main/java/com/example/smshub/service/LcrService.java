package com.example.smshub.service;

import java.util.List;

import com.example.smshub.model.Lcr;
import com.example.smshub.model.LcrDto;

public interface LcrService {

	Lcr save(LcrDto lcr_data);
	List<Lcr> findAll();
}
