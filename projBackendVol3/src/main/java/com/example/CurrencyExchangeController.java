
/*
package com.example;
//package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	@RequestMapping("/api/exchangerates")
	public class CurrencyExchangeController {

	// File: com.example.demo.CurrencyExchangeController.java
	    @Autowired
	    private CurrencyExchangeService currencyExchangeService;

	    @GetMapping("/get/{baseCurrency}")
	    public ExchangeRate getExchangeRates(@PathVariable String baseCurrency) {
	        return currencyExchangeService.getExchangeRates(baseCurrency);
	    }

	    @GetMapping("/update/{baseCurrency}")
	    public void updateExchangeRates(@PathVariable String baseCurrency) {
	        currencyExchangeService.updateExchangeRates(baseCurrency);
	    }
	    
	    
	    //.save();
	    //GetMapping
	    //PostMapping
	    
	}

*/	
	
	// src/main/java/com/example/CurrencyExchangeController.java
package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;//dikkat
import org.springframework.http.ResponseEntity; //dikkat
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.currencyExchangeServices;



@RestController
@RequestMapping("/api/exchangerates")
public class CurrencyExchangeController {

    
    @Autowired
    private CurrencyRepository currencyRepository;
    /*
    @GetMapping("/get/{mainCurrency}")
    public Currency getExchangeRates(@PathVariable String mainCurrency) {
        return currencyRepository.findByMainCurrency(mainCurrency);
        
    }
	*/
    @GetMapping("/get/{mainCurrency}")
    public ResponseEntity<?> getExchangeRates(@PathVariable String mainCurrency) {
        Currency currency = currencyRepository.findByMainCurrency(mainCurrency);
        if (currency != null) {
            return ResponseEntity.ok(currency);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No currency found for " + mainCurrency);
        }
    }

    
    
    
    
    
    
    @GetMapping("/getAllCurrencies")
    public List<Currency> getAllCurrencies() {
        return currencyRepository.findAll();
        
    }
    /*
    @PostMapping("/save")
    public void saveCurrency(@RequestBody Currency currency) {
        currencyRepository.save(currency);
    }
    */
    @PostMapping("/save")
    public ResponseEntity<String> saveCurrency(@RequestBody Currency currency) {
        try {
            currencyRepository.save(currency);
            return ResponseEntity.ok("Currency saved successfully!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save currency: " + e.getMessage());
        }
    }
    
}
	

