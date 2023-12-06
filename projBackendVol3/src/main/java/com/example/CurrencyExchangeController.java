package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exchangerates") // The adress of the api.

public class CurrencyExchangeController {

    @Autowired
    private CurrencyRepository currencyRepository; // CurrencyRepository object for calling the methods.
    
    @GetMapping("/get/{mainCurrency}")
    public ResponseEntity<?> getExchangeRates(@PathVariable String mainCurrency) { // Returns the following depending the result of the method.
        Currency currency = currencyRepository.findByMainCurrency(mainCurrency);
        if (currency != null) {
            return ResponseEntity.ok(currency);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No currency found for " + mainCurrency);
        }
    }

    @GetMapping("/getAllCurrencies")
    public List<Currency> getAllCurrencies() { // Outputs all the Currency objects in the database.
        return currencyRepository.findAll();
        
    }
    
    @PostMapping("/save") // Takes a Currency object in json format, uploads to the database. If not successfull, throws an error.
    public ResponseEntity<String> saveCurrency(@RequestBody Currency currency) {
        try {
            currencyRepository.save(currency);
            return ResponseEntity.ok("Currency saved successfully!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save currency: " + e.getMessage());
        }
    }
    
}
	

