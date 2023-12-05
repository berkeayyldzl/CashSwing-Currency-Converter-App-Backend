package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class currencyExchangeServices {

    @Autowired
    private CurrencyRepository currencyRepository; // Assuming you have a CurrencyRepository

    // Method to retrieve exchange rates for a specific base currency
    public ExchangeRate getExchangeRates(String baseCurrency) {
        // Implement your logic to fetch exchange rates from the repository based on the provided baseCurrency
        Currency currency = currencyRepository.findByBaseCurrency(baseCurrency); // Example method, adjust based on your repository structure
        if(currency == null) {
            // Handle scenario when rates are not found for the base currency
            return null;
        }
        return new ExchangeRate(currency.getBaseCurrency(), currency.getTargetCurrency(), currency.getExchangeRate());
    }

    // Method to update exchange rates for a specific base currency
    public void updateExchangeRates(String baseCurrency) {
        // Implement your logic to update exchange rates for the provided baseCurrency
        // This might involve fetching data from an external API and updating the repository
        // Example:
        // Call an external API to get updated rates
        // Update the currencyRepository with the new rates for the provided baseCurrency
        // currencyRepository.updateRatesForBaseCurrency(baseCurrency, newRates);
    }
}

//bir kur seç
//dolae / tl
//ne kadar dolar = 20
//dolkar / tl == 0.33
//print 20 * 0.33