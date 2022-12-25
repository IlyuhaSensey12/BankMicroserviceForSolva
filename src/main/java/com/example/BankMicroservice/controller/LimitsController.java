package com.example.BankMicroservice.controller;

import com.example.BankMicroservice.model.LimitEntity;
import com.example.BankMicroservice.model.OperationEntity;
import com.example.BankMicroservice.service.ILimitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limits")
public class LimitsController {
    @Autowired
    private ILimitService iLimitService;

    @PutMapping("/updatePost")
    public void updateLimit(@RequestBody LimitEntity limitEntity){
        iLimitService.updateLimit(limitEntity);
    }
}
