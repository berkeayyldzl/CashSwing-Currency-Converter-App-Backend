package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

@Service
public class CurrencyExchangeService {

    @Autowired
    private ExchangeRateRepository exchangeRateRepository;

    public ExchangeRate getExchangeRates(String baseCurrency) {
        return exchangeRateRepository.findByBaseCurrency(baseCurrency);
    }

    public void updateExchangeRates(String baseCurrency, Map<String, Double> newRates) {
        ExchangeRate exchangeRate = exchangeRateRepository.findByBaseCurrency(baseCurrency);

        if (exchangeRate == null) {
            // Create a new document if it doesn't exist
            exchangeRate = new ExchangeRate();
            exchangeRate.setBaseCurrency(baseCurrency);
            exchangeRate.setLastUpdated(new Date());
        }

        // Update the rates and lastUpdated fields
        exchangeRate.setRates(newRates);
        exchangeRate.setLastUpdated(new Date());

        // Save the updated document to the database
        exchangeRateRepository.save(exchangeRate);
    }
}


