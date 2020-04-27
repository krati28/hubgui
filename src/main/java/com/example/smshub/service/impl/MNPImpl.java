package com.example.smshub.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smshub.model.*;
import com.example.smshub.service.MNPService;
import com.example.smshub.dao.MNPdao;


@Transactional
@Service(value ="MNPServcie")
public class MNPImpl implements MNPService{
       @Autowired
       private MNPdao mnpdao;
       
       @Override
       public void delete(int mnp_id) {
              mnpdao.deleteById(mnp_id);
       }
       @Override
       public MNP findById(int mnp_id) {
              Optional<MNP> optionalUser =mnpdao.findById(mnp_id);
              return optionalUser.isPresent() ? optionalUser.get() : null;
       }

    @Override
    public MNPdto update(MNPdto mnp) {
       MNP p = findById(mnp.getMnp_id());
        if(p != null) {
            BeanUtils.copyProperties(mnp, p, "password", "username");
            mnpdao.save(p);
        }
        return mnp;
    }
       
       
       
       
       
       public List<MNP> findAll() {
              List<MNP> list = new ArrayList<>();
              mnpdao.findAll().iterator().forEachRemaining(list::add);
              return list;
       }
       public MNP save(MNPdto mnp) {
              MNP m = new MNP();
       m.setMnp_id(mnp.getMnp_id());
       m.setMnp_type(mnp. getMnp_type());
       m.setGateway_name(mnp.getGateway_name() );
       m.setConfig(mnp.getConfig());
       m.setCache_name(mnp.getCache_name());
       
        return mnpdao.save(m);
    }

}

