package com.example.smshub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smshub.model.ApiResponse;
import com.example.smshub.model.Lcr;
import com.example.smshub.model.LcrDto;
import com.example.smshub.service.LcrService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/lcrdetails")

public class LcrController {
	
	@Autowired
	private LcrService lcrservice;

	@PostMapping
    public ApiResponse<Lcr> saveLcr_data(@RequestBody LcrDto lcr){
        return new ApiResponse<>(HttpStatus.OK.value(), "saved successfully.",lcrservice.save(lcr));
    }

    @GetMapping
    public ApiResponse<List<Lcr>> listLcr(){
        return new ApiResponse<>(HttpStatus.OK.value(), "list fetched successfully.",lcrservice.findAll());
    }

}
