
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
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.currencyExchangeService.currencyExchangeServices;


@RestController
@RequestMapping("/api/exchangerates")
public class CurrencyExchangeController {

    @Autowired
    private currencyExchangeServices currencyExchangeService;

    @GetMapping("/get/{baseCurrency}")
    public double getExchangeRates(@PathVariable String baseCurrency) {
        return currencyExchangeService.getExchangeRates(baseCurrency);
    }

    @GetMapping("/getAllCurrencies")
    public List<Currency> getAllCurrencies() {
        return currencyExchangeService.getAllCurrencies();
    }

    @PostMapping("/save")
    public void saveCurrency(@RequestBody Currency currency) {
        currencyExchangeService.saveCurrency(currency);
    }
}
	

