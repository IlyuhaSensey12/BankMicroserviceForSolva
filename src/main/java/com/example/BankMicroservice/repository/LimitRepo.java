package com.example.BankMicroservice.repository;


import com.example.BankMicroservice.model.LimitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LimitRepo extends JpaRepository<LimitEntity, Long> {

}
