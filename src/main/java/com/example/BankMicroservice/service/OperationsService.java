package com.example.BankMicroservice.service;

import com.example.BankMicroservice.model.LimitEntity;
import com.example.BankMicroservice.model.OperationEntity;
import com.example.BankMicroservice.repository.OperationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OperationsService implements IOperationService{
    @Autowired
    private OperationRepo operationRepo;

    @Override
    public void save(OperationEntity operationEntity) {
        LimitEntity limitEntity = operationRepo.findOperationEntityById(operationEntity.getLimitEntity().getId()).getLimitEntity();
        limitEntity.setLimit_sum(limitEntity.getLimit_sum().subtract(operationEntity.getSum()));
        operationRepo.save(operationEntity);
    }

    @Override
    public Optional<OperationEntity> findById(long id) {
        return operationRepo.findById(id);
    }

    @Override
    public List<OperationEntity> findAll() {
        return operationRepo.findAll();
    }

    @Override
    public List<OperationEntity> findAllByFalse() {
        return null;
    }

//    @Override
//    public void updateOperation(OperationEntity operationEntity) {
//        operationEntity = operationRepo.findOperationEntityById(operationEntity.getId());
//        operationEntity.setSum(operationEntity.getSum());
//        operationEntity.getLimitEntities();
//
//        LimitEntity limitEntity = operationEntity.getLimitEntities().get(0);
//        limitEntity.setLimit_sum(limitEntity.getLimit_sum().subtract(operationEntity.getSum()));
//        operationRepo.save(operationEntity);
//    }


}
