package com.example.smshub.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smshub.dao.OperatorDetailsDao;
import com.example.smshub.model.CustomerDetails;
import com.example.smshub.model.OperatorDetails;
import com.example.smshub.model.OperatorDetailsDto;
import com.example.smshub.service.OperatorDetailsService;


	@Transactional
	@Service(value = "operatorService")

public class OperatorDetailsServiceImpl implements OperatorDetailsService {
	
		@Autowired
		private OperatorDetailsDao operatorDao;
		
		@Override
		public List<OperatorDetails> findAllOperators() {
			List<OperatorDetails> list = new ArrayList<>();
			operatorDao.findAllOperators().iterator().forEachRemaining(list::add);
			return list;
		}

//		public List<OperatorDetails> findAll() {
//			List<OperatorDetails> list = new ArrayList<>();
//			operatorDao.findAll().iterator().forEachRemaining(list::add);
//			return list;
//		}

//		@Override
//		public void delete(int operator_id) {
//			operatorDao.deleteById(operator_id);
//		}

//		@Override
//		public User findOne(String clustername) {
//			return userDao.findByClustername(clustername);
//		}
//
//		@Override
//		public OperatorDetails findById(int operator_id) {
//			Optional<OperatorDetails> optionalUser = operatorDao.findById(operator_id);
//			return optionalUser.isPresent() ? optionalUser.get() : null;
//		}
//
//	    @Override
//	    public OperatorDetailsDto update(OperatorDetailsDto operatorDto) {
//	    	OperatorDetails opdata = findById(operatorDto.getOperator_id());
//	        if(opdata != null) {
//	            BeanUtils.copyProperties(operatorDto, opdata, "password", "username");
//	            operatorDao.save(opdata);
//	        }
//	        return operatorDto;
//	    }
//
//	    @Override
//	    public OperatorDetails save(OperatorDetailsDto opdata) {
//	    	OperatorDetails newUser = new OperatorDetails();
////		    newUser.setId(user.getId());
//		    newUser.setOperator_name(opdata.getOperator_name());
//	        return operatorDao.save(newUser);
//	    }

//	    @Override
//		public OperatorDetails findOne(String operator_name) {
//			// TODO Auto-generated method stub
//			return null;
//		}



}
