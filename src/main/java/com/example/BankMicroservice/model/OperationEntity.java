package com.example.BankMicroservice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "operations")
public class OperationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int account_from;
    private int account_to;
    private String currency_shortname;
    private BigDecimal sum;
    private String expense_category;
    private Date date = new Date(System.currentTimeMillis());
    @ManyToOne
    private LimitEntity limitEntity;
}
