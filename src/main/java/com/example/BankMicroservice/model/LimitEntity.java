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
@Table(name="limits")
public class LimitEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private BigDecimal limit_sum;
    private Date limit_datetime = new Date(System.currentTimeMillis());
    private String limit_currency_shortname;
//    private boolean limit_exceed;

    @OneToMany(targetEntity = OperationEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ol_fk", referencedColumnName = "id")
    private List<OperationEntity> operationEntities;
}
