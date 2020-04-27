package com.example.smshub.service;

import java.util.List;

import com.example.smshub.model.PointCodeDetails;
import com.example.smshub.model.PointCodeDetailsdto;



public interface PointCodeDetailsService {
                PointCodeDetails save(PointCodeDetailsdto pcd);
    List<PointCodeDetails> findAll();
    void delete(int id);

    

    PointCodeDetails findById(int ptcode_id);

    PointCodeDetailsdto update(PointCodeDetailsdto pcd);
}
