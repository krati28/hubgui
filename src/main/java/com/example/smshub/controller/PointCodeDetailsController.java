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

import com.example.smshub.service.PointCodeDetailsService;

import com.example.smshub.model.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/pcddetails")
public class PointCodeDetailsController {
                @Autowired
                private PointCodeDetailsService pcdservice;

                @PostMapping
    public ApiResponse<PointCodeDetails> savePointCodeDetails(@RequestBody PointCodeDetailsdto pcd){
        return new ApiResponse<>(HttpStatus.OK.value(), "saved successfully.",pcdservice.save(pcd));
    }

    @GetMapping
    public ApiResponse<List<PointCodeDetails>> listPointCodeDetails(){
        return new ApiResponse<>(HttpStatus.OK.value(), "list fetched successfully.",pcdservice.findAll());
    }
    
    @GetMapping("/{id}")
    public ApiResponse<PointCodeDetails> getOne(@PathVariable int id){
       return new ApiResponse<>(HttpStatus.OK.value(), " fetched successfully.",pcdservice.findById(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<PointCodeDetailsdto> update(@RequestBody PointCodeDetailsdto pcd) {
        return new ApiResponse<>(HttpStatus.OK.value(), "updated successfully.",pcdservice.update(pcd));
    }
    

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
                pcdservice.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "deleted successfully.", null);
    }
}
