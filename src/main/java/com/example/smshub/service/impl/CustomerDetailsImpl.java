package com.example.smshub.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smshub.dao.CustomerDetailsdao;
import com.example.smshub.model.CustomerDetails;
import com.example.smshub.service.CustomerDetailsService;

@Transactional
@Service("CustomerDetailsService")
public class CustomerDetailsImpl implements CustomerDetailsService{
	@Autowired
	private CustomerDetailsdao customerDetailsDao;
	
//	@Override
//	public List<CustomerDetails> findAll() {
//		List<CustomerDetails> list = new ArrayList<>();
//		customerDetailsDao.findAll().iterator().forEachRemaining(list::add);
//		return list;
//	}

	@Override
	public List<CustomerDetails> findAllCustomers() {
		List<CustomerDetails> list = new ArrayList<>();
		customerDetailsDao.findAllCustomers().iterator().forEachRemaining(list::add);
		return list;
	}
	
	@Override
	public List<CustomerDetails> findAllSuppliers() {
		List<CustomerDetails> list = new ArrayList<>();
		customerDetailsDao.findAllSuppliers().iterator().forEachRemaining(list::add);
		return list;
	}
	
	@Override
	public List<CustomerDetails> findAllSMPPSuppliers() {
		List<CustomerDetails> list = new ArrayList<>();
		customerDetailsDao.findAllSuppliers().iterator().forEachRemaining(list::add);
		return list;
	}
}