package com.example.BankMicroservice.controller;


import com.example.BankMicroservice.model.LimitEntity;
import com.example.BankMicroservice.model.OperationEntity;
import com.example.BankMicroservice.service.IOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/operations")
public class OperationController {
    @Autowired
    private IOperationService iOperationService;

    @PostMapping("/addOperation")
    public void add(@RequestBody OperationEntity operationEntity){
        iOperationService.save(operationEntity);
    }

    @GetMapping("/{id}")
    public Optional<OperationEntity> findById(@PathVariable long id){
        return iOperationService.findById(id);
    }

    @GetMapping("/all")
    public List<OperationEntity> findAll(){
        return iOperationService.findAll();
    }
//    @PutMapping("/makeTransactional")
//    public void updateOperationById(@RequestBody OperationEntity operationEntity){
//        iOperationService.updateOperation(operationEntity);
//    }
}
