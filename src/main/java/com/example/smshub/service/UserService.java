package com.example.smshub.service;

import java.util.List;
import com.example.smshub.model.User;
import com.example.smshub.model.UserDto;

public interface UserService {

	User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String clustername);

    User findById(int id);

    UserDto update(UserDto userDto);
}
