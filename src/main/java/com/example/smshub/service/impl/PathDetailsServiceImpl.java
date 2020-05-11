package com.example.smshub.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smshub.dao.PathDetailsDao;
import com.example.smshub.model.PathDetails;
import com.example.smshub.model.PathDetailsDto;
import com.example.smshub.service.PathDetailsService;

import java.util.ArrayList;

@Transactional
@Service(value = "pathdetailsservice")

public class PathDetailsServiceImpl implements PathDetailsService{

	@Autowired
	private PathDetailsDao pathdetailsdao;
	public List< PathDetails> findAll() {
		List< PathDetails> list = new ArrayList<>();
		pathdetailsdao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}
	
	@Override
	public void delete(int id) {
	pathdetailsdao.deleteById(id);
	}

//	@Override
//	public Lcr findOne(String lcr_name) {
//		return lcrdao.findByLcr_name(lcr_name);
//	}

	@Override
	public PathDetails findById(int path_id) {
		Optional<PathDetails> optionalUser = pathdetailsdao.findById(path_id);
		return optionalUser.isPresent() ? optionalUser.get() : null;
	}

    @Override
    public PathDetailsDto update(PathDetailsDto pathdetailsDto) {
    	PathDetails path_data = findById(pathdetailsDto.getPath_id());
        if(path_data != null) {
            BeanUtils.copyProperties(pathdetailsDto, path_data, "password", "username");
            pathdetailsdao.save(path_data);
        }
        return pathdetailsDto;
    }

    @Override
	public PathDetails save(PathDetailsDto path) {
    	PathDetails newPathDetails = new PathDetails();
    	newPathDetails.setPath_name(path.getPath_name());
    	newPathDetails.setInterface_type(path. getInterface_type());
    	newPathDetails.setOc_compliance_flag(path.getOc_compliance_flag());
//    	newPathDetails.setSupplier_id(path.getSupplier_id());
        return pathdetailsdao.save(newPathDetails);
    }

	@Override
	public PathDetails findOne(String path_name) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
