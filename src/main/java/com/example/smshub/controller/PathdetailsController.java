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
import com.example.smshub.model.PathDetails;
import com.example.smshub.model.PathDetailsDto;
import com.example.smshub.service.PathDetailsService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/pathdetails")
public class PathdetailsController {
	
	@Autowired
	private PathDetailsService pathdetailsservice;

	@PostMapping
    public ApiResponse<PathDetails> savePathDetails(@RequestBody PathDetailsDto path){
        return new ApiResponse<>(HttpStatus.OK.value(), "saved successfully.",pathdetailsservice.save(path));
    }

    @GetMapping
    public ApiResponse<List<PathDetails>> listPathDetails(){
        return new ApiResponse<>(HttpStatus.OK.value(), "list fetched successfully.",pathdetailsservice.findAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<PathDetails> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.",pathdetailsservice.findById(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<PathDetailsDto> update(@RequestBody PathDetailsDto pathdetailsDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully.",pathdetailsservice.update(pathdetailsDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
    	pathdetailsservice.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
    }




}
