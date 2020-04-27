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
import com.example.smshub.model.RedirectionListAdd;
import com.example.smshub.model.RedirectionListDto;
import com.example.smshub.service.RedirectionListService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/rllist")
public class RedirectionListController {
	
	@Autowired
	private RedirectionListService redirectionListService;

	@PostMapping
    public ApiResponse<RedirectionListAdd> saveUser(@RequestBody RedirectionListDto rldto){
        return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",redirectionListService.save(rldto));
    }

    @GetMapping
    public ApiResponse<List<RedirectionListAdd>> listUser(){
    	return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched sucessfuly.", redirectionListService.findAll());
    }
    
    @GetMapping("/{id}")
    public ApiResponse<RedirectionListAdd> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.",redirectionListService.findById(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<RedirectionListDto> update(@RequestBody RedirectionListDto rldto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully.",redirectionListService.update(rldto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
        redirectionListService.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
    }
 
	 
}
