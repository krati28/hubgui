package com.example.smshub.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.smshub.model.PathDetails;

@Repository
public interface PathDetailsDao extends CrudRepository<PathDetails, Integer>{

}
