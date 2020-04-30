package com.example.smshub.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smshub.dao.UserDao;
import com.example.smshub.model.User;
import com.example.smshub.model.UserDto;
import com.example.smshub.service.UserService;


	@Transactional
	@Service(value = "userService")
	public class UserServiceImpl implements UserService {
		
		@Autowired
		private UserDao userDao;

		public List<User> findAll() {
			List<User> list = new ArrayList<>();
			userDao.findAll().iterator().forEachRemaining(list::add);
			return list;
		}

		@Override
		public void delete(int id) {
			userDao.deleteById(id);
		}

//		@Override
//		public User findOne(String clustername) {
//			return userDao.findByClustername(clustername);
//		}

		@Override
		public User findById(int cluster_id) {
			Optional<User> optionalUser = userDao.findById(cluster_id);
			return optionalUser.isPresent() ? optionalUser.get() : null;
		}

	    @Override
	    public UserDto update(UserDto userDto) {
	        User user = findById(userDto.getCluster_id());
	        if(user != null) {
	            BeanUtils.copyProperties(userDto, user, "password", "username");
	            userDao.save(user);
	        }
	        return userDto;
	    }

	    @Override
	    public User save(UserDto user) {
		    User newUser = new User();
//		    newUser.setId(user.getId());
		    newUser.setCluster_name(user.getCluster_name());
		    newUser.setCluster_type(user.getCluster_type());
		    newUser.setOperator_ids(user.getOperator_ids());
	        return userDao.save(newUser);
	    }

		@Override
		public User findOne(String cluster_name) {
			// TODO Auto-generated method stub
			return null;
		}

}
