package com.example.BankMicroservice.repository;

import com.example.BankMicroservice.model.RateEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<RateEntity, Long> {
}
