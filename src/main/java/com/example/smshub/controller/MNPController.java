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
//import com.example.smshub.dao.*;
//import com.example.smshub.impl.*;
import com.example.smshub.service.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/mnpdetails")
public class MNPController {

                @Autowired
                private MNPService mnpservice;
                @PostMapping
    public ApiResponse<MNP> saveMNP(@RequestBody MNPdto mnp){
        return new ApiResponse<>(HttpStatus.OK.value(), "saved successfully.",mnpservice.save(mnp));
    }

    @GetMapping
    public ApiResponse<List<MNP>> listMNP(){
        return new ApiResponse<>(HttpStatus.OK.value(), "list fetched successfully.",mnpservice.findAll());
    }
    @GetMapping("/{id}")
    public ApiResponse<MNP> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), " fetched successfully.",mnpservice.findById(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<MNPdto> update(@RequestBody MNPdto mnp) {
        return new ApiResponse<>(HttpStatus.OK.value(), "updated successfully.",mnpservice.update(mnp));
    }
    

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
                mnpservice.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "deleted successfully.", null);
    }
                
                
}
