package com.example.smshub.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smshub.service.PointCodeDetailsService;

import com.example.smshub.model.*;
import com.example.smshub.dao.*;

@Transactional
@Service(value = "PointCodeDetailsService")
public class PointCodeDetailsImpl implements PointCodeDetailsService{
                @Autowired
                private PointCodeDetailsDAO pcddao;
                public List< PointCodeDetails> findAll() {
                                List< PointCodeDetails> list = new ArrayList<>();
                                pcddao.findAll().iterator().forEachRemaining(list::add);
                                return list;
                }
                @Override
                public void delete(int id) {
                                pcddao.deleteById(id);
                }

//            @Override
//            public PointCodeDetails findOne(String operatorname) {
//                            return pcddao.findByOperatorname(operatorname);
//            }
                
//            @Override
//            public PointCodeDetails findOne(int tt) {
//                            return pcddao.findByTt(tt);
//            }

                @Override
                public PointCodeDetails findById(int ptcode_id) {
                                Optional<PointCodeDetails> optionalUser =pcddao.findById(ptcode_id);
                                return optionalUser.isPresent() ? optionalUser.get() : null;
                }

    @Override
    public PointCodeDetailsdto update(PointCodeDetailsdto pcd) {
                PointCodeDetails p = findById(pcd.getPtcode_id());
        if(p != null) {
            BeanUtils.copyProperties(pcd, p, "password", "username");
            pcddao.save(p);
        }
        return pcd;
    }

    
                
                
                public PointCodeDetails save(PointCodeDetailsdto pcd) {
                                PointCodeDetails newPointCodeDetails = new PointCodeDetails();
                newPointCodeDetails.setPoint_code(pcd.getPoint_code());
                newPointCodeDetails.setOperator_name(pcd. getOperator_name());
                newPointCodeDetails.setOperator_country(pcd.getOperator_country() );
                newPointCodeDetails.setSap_id(pcd. getSap_id());
                newPointCodeDetails.setTt(pcd.getTt());
                newPointCodeDetails.setNp(pcd.getNp());
                newPointCodeDetails.setSsn(pcd.getSsn());
                newPointCodeDetails.setStatus(pcd.getStatus());
                newPointCodeDetails.setDelay(pcd.getDelay());
        return pcddao.save(newPointCodeDetails);
    }
                

}
