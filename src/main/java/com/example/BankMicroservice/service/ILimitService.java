package com.example.BankMicroservice.service;


import com.example.BankMicroservice.model.LimitEntity;
import com.example.BankMicroservice.model.OperationEntity;

public interface ILimitService {
    void updateLimit(LimitEntity limitEntity);
}
