package com.example.smshub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smshub.model.ApiResponse;
import com.example.smshub.model.Lcr;
import com.example.smshub.model.LcrDto;
import com.example.smshub.model.User;
import com.example.smshub.model.UserDto;
import com.example.smshub.service.LcrService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/lcrdetails")

public class LcrController {
	
	@Autowired
	private LcrService lcrservice;

	@PostMapping
    public ApiResponse<Lcr> saveLcr(@RequestBody LcrDto lcr){
        return new ApiResponse<>(HttpStatus.OK.value(), "saved successfully.",lcrservice.save(lcr));
    }

    @GetMapping
    public ApiResponse<List<Lcr>> listLcr(){
        return new ApiResponse<>(HttpStatus.OK.value(), "list fetched successfully.",lcrservice.findAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<Lcr> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.",lcrservice.findById(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<LcrDto> update(@RequestBody LcrDto lcrDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully.",lcrservice.update(lcrDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
        lcrservice.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
    }



}
