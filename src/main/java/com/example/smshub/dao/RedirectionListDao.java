package com.example.smshub.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.smshub.model.RedirectionListAdd;

@Repository
public interface RedirectionListDao extends CrudRepository<RedirectionListAdd, Integer>{
	
	RedirectionListAdd findByListname(String listname);
}

