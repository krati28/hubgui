package com.example.smshub.service;

import java.util.List;
import com.example.smshub.model.RedirectionListAdd;
import com.example.smshub.model.RedirectionListDto;

public interface RedirectionListService {
	
	RedirectionListAdd save(RedirectionListDto dto);
	List<RedirectionListAdd> findAll();
	void delete(int id);
	
	RedirectionListAdd findOne(String listname);
	
	RedirectionListAdd findById(int id);
	
	RedirectionListDto update(RedirectionListDto rldto);
}
