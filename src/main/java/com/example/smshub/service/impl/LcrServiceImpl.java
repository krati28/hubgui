package com.example.smshub.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smshub.dao.LcrDao;
import com.example.smshub.model.Lcr;
import com.example.smshub.model.LcrDto;
import com.example.smshub.service.LcrService;

import java.util.ArrayList;



@Transactional
@Service(value = "LcrService")

public class LcrServiceImpl implements LcrService{
	
	@Autowired
	private LcrDao lcrdao;
	public List< Lcr> findAll() {
		List< Lcr> list = new ArrayList<>();
		 lcrdao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}
	
	public Lcr save(LcrDto lcr) {
		Lcr newLcr = new Lcr();
    	newLcr.setLcr_name(lcr.getLcr_name());
    	newLcr.setLcr_type(lcr. getLcr_type());
        return lcrdao.save(newLcr);
    }


}
