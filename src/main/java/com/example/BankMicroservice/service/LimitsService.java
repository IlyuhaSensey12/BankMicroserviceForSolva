package com.example.BankMicroservice.service;

import com.example.BankMicroservice.model.LimitEntity;
import com.example.BankMicroservice.model.OperationEntity;
import com.example.BankMicroservice.repository.LimitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class LimitsService implements ILimitService{

    @Autowired
    private LimitRepo limitRepo;

    public void updateLimit(LimitEntity limitEntity) {
        limitEntity.setLimit_sum(limitEntity.getLimit_sum());
        limitRepo.save(limitEntity);
    }

}
