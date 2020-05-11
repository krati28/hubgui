package com.example.smshub.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smshub.dao.DealDao;
import com.example.smshub.model.DealDto;
import com.example.smshub.model.DealManagement;
import com.example.smshub.service.DealService;

@Transactional
@Service("DealService")
public class DealImpl implements DealService{
	
	@Autowired
	private DealDao dealdao;
	
	@Override
	public DealManagement save(DealDto dto) {
		DealManagement dealMgmt = new DealManagement();
		dealMgmt.setId(dto.getId());
		dealMgmt.setName(dto.getName());
		dealMgmt.setOptions(dto.getOptions());
		dealMgmt.setRate(dto.getRate());
		dealMgmt.setStart_date(dto.getStart_date());
		dealMgmt.setType(dto.getType());
		dealMgmt.setValidity_prd(dto.getValidity_prd());
		dealMgmt.setValue(dto.getValue());
		return dealdao.save(dealMgmt);
	}

	@Override
	public List<DealManagement> findAll() {
		List<DealManagement> list = new ArrayList<>();
		dealdao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dealdao.deleteById(id);
	}

	@Override
	public DealManagement findById(int deal_id) {
		Optional<DealManagement> optionalUser = dealdao.findById(deal_id);
		return optionalUser.isPresent() ? optionalUser.get() : null;
	}

	@Override
	public DealDto update(DealDto deal) {
		// TODO Auto-generated method stub
		DealManagement dm = findById(deal.getId());
		if(dm != null) {
			BeanUtils.copyProperties(deal, dm, "password", "username");
			dealdao.save(dm);
		}
		return deal;
	}


}