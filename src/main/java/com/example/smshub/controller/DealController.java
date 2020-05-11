package com.example.smshub.controller;

import java.util.List;

import javax.validation.Valid;

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
import com.example.smshub.model.DealDto;
import com.example.smshub.model.DealManagement;
import com.example.smshub.service.DealService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/deal")

public class DealController {
	@Autowired
	private DealService dealService;
	
	@PostMapping
	public ApiResponse<DealManagement> saveDeal(@Valid @RequestBody DealDto dto){
		return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully", dealService.save(dto));
	}

    @GetMapping
    public ApiResponse<List<DealManagement>> listUser(){
    	return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully", dealService.findAll());
    }
    
    @GetMapping("/{id}")
    public ApiResponse<DealManagement> getOne(@PathVariable int id){
    	return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully", dealService.findById(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<DealDto> update(@RequestBody DealDto ddto){
    	return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully", dealService.update(ddto));
    }
    

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id){
    	dealService.delete(id);
    	return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully", null);
    }

}