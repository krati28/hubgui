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

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/operatordetails")
public class OperatorDetailsController {

	@Autowired
    private OperatorDetailsService operatorService;

    @PostMapping
    public ApiResponse<OperatorDetails> saveUser(@RequestBody OperatorDetailsDto opdata){
        return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",operatorService.save(opdata));
    }

    @GetMapping
    public ApiResponse<List<OperatorDetails>> listUser(){
        return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched successfully.",operatorService.findAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<OperatorDetails> getOne(@PathVariable int operator_id){
        return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.",operatorService.findById(operator_id));
    }

    @PutMapping("/{id}")
    public ApiResponse<OperatorDetailsDto> update(@RequestBody OperatorDetailsDto operatorDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully.",operatorService.update(operatorDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int operator_id) {
        operatorService.delete(operator_id);
        return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
    }




}
