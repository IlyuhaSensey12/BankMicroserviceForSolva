package com.example.BankMicroservice.repository;

import com.example.BankMicroservice.model.OperationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepo extends JpaRepository<OperationEntity, Long> {
    OperationEntity findOperationEntityById(long id);

//    OperationEntity findOperationEntityByLimitEntityLimit_exceed(boolean limit_exceed);
}
