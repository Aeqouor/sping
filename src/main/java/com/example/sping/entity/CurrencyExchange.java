package com.example.sping.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class CurrencyExchange extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "toCurrencyId")
    private Currency tocurrency;

    private BigDecimal amountInEur;
    private BigDecimal amountAfterExchange;
    private String status;

}
