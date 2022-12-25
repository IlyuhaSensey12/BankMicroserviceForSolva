package com.example.BankMicroservice.service;


import com.example.BankMicroservice.model.LimitEntity;
import com.example.BankMicroservice.model.OperationEntity;

import java.util.List;
import java.util.Optional;

public interface IOperationService {

    void save(OperationEntity operationsEntity);

    public Optional<OperationEntity> findById(long id);

    List<OperationEntity> findAll();

//    void updateOperation(OperationEntity operationEntity);

    List<OperationEntity> findAllByFalse();
}
