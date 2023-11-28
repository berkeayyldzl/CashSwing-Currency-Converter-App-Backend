package com.example;

public class CurrencyExchangeController {

	// File: com.example.demo.CurrencyExchangeController.java

	package com.example.demo;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/api/exchangerates")
	public class CurrencyExchangeController {

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
	}

	
	
	
}
