package com.example;

import org.springframework.boot.SpringApplication;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjBackendVol2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjBackendVol2Application.class, args);
	}
	/*
	@Override
    public void run(String... args) throws Exception {
        // Initialize sample data if the repository is empty
        if (currencyExchangeService.getAllCurrencies().isEmpty()) {
            Currency usdToEuro = new Currency("USD", "EUR", 0.85);
            Currency usdToJPY = new Currency("USD", "JPY", 110.20);
            Currency eurToGBP = new Currency("EUR", "GBP", 0.89);

            currencyExchangeService.saveCurrency(usdToEuro);
            currencyExchangeService.saveCurrency(usdToJPY);
            currencyExchangeService.saveCurrency(eurToGBP);
        }
        
        
        
    }
    */
}




