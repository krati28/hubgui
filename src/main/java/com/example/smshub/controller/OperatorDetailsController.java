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

import com.example.smshub.model.*;
import com.example.smshub.service.OperatorDetailsService;

@RestController
@RequestMapping
public class OperatorDetailsController {

	@Autowired
    private OperatorDetailsService operatorService;

	@GetMapping("/operators")
	@CrossOrigin//(origins = "http://localhost:3000/")
    public ApiResponse<List<OperatorDetails>> listOperators(){
    	return new ApiResponse<>(HttpStatus.OK.value(), "Customers fetched successfully", operatorService.findAllOperators());
    }
	
}
