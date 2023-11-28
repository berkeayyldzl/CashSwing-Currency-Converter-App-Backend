// File: com.example.demo.ExchangeRate.java

package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Map;

@Document(collection = "exchange_rates")
public class ExchangeRate {

    @Id
    private String id;

    private String baseCurrency;
    private Map<String, Double> rates;
    private Date lastUpdated;

    // Constructors, getters, and setters

    
    public ExchangeRate(String baseCurrency, Map<String, Double> rates, Date lastUpdated) {
        this.baseCurrency = baseCurrency;
        this.rates = rates;
        this.lastUpdated = lastUpdated;
    }
}
