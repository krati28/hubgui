package com.example.smshub.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smshub.dao.RedirectionListDao;
import com.example.smshub.model.RedirectionListAdd;
import com.example.smshub.model.RedirectionListDto;
import com.example.smshub.service.RedirectionListService;


@Transactional
@Service(value = "redirectionListService")
public class RedirectionListServiceImpl implements RedirectionListService{
	
	@Autowired
	private RedirectionListDao rldao;

	@Override
	public List<RedirectionListAdd> findAll() {
		List<RedirectionListAdd> list = new ArrayList<>();
		rldao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public RedirectionListAdd findOne(String listname) {
		return rldao.findByListname(listname);
	}

	@Override
	public RedirectionListDto update(RedirectionListDto rldto) {
		RedirectionListAdd rladd = findById(rldto.getId());
		if(rladd!=null) {
			BeanUtils.copyProperties(rldto,rladd,"password","username");
			rldao.save(rladd);
		}
		return rldto;
	}
	
	@Override
	public void delete(int id) {
		rldao.deleteById(id);
	}

	@Override
	public RedirectionListAdd findById(int id) {
		Optional<RedirectionListAdd> optionalUser = rldao.findById(id);
		return optionalUser.isPresent()? optionalUser.get() : null;
	}

	@Override
	public RedirectionListAdd save(RedirectionListDto dto) {
		RedirectionListAdd rl_add = new RedirectionListAdd();
		rl_add.setId(dto.getId());
		rl_add.setListname(dto.getListname());
		rl_add.setListtype(dto.getListtype());
		rl_add.setLoadDistributionType(dto.getLoadDistributionType());
		return rldao.save(rl_add);
	}

	
}
