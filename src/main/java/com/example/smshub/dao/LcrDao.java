package com.example.smshub.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.smshub.model.Lcr;
import com.example.smshub.model.User;

@Repository
public interface LcrDao extends CrudRepository<Lcr, Integer>{

//	  Lcr findByLcr_name(String lcr_name);
}
