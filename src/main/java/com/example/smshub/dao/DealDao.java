package com.example.smshub.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.smshub.model.DealManagement;

@Repository
public interface DealDao extends JpaRepository<DealManagement, Integer>{
	
}