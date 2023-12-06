
package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

class currencyExchangeService extends Currency{

	@Service
	public class currencyExchangeServices { 
		
		List<Currency> currencies = new ArrayList<>();
		
		@Autowired
	
	    private CurrencyRepository currencyRepository;

	    private List<Currency> currencyList = new ArrayList<>();


	    private void initCurrencyList() {
	        // Retrieve currencies from the repository and add them to the list
	        currencyList.addAll(currencyRepository.findAll());
	    }

	    public double getExchangeRates(String baseCurrency) {
	        double exchangeRate = currencyRepository.findByBaseCurrency(baseCurrency);
	        return exchangeRate;
	    }
	    
	    public Currency getCurrencyById(String id) {
	        return currencyRepository.findById(id).orElse(null);
	    }

	    public void saveCurrency(Currency currency) {
	        currencyRepository.save(currency);
	        // Update the list when a new currency is added
	        currencyList.add(currency);
	    }

	    public List<Currency> getAllCurrencies() {
	        return currencyList;
	    }

	    // Add other methods as needed
	}
		
    
    
	   
    
}    
    
    
    
    
    
    


//bir kur seç
//dolae / tl
//ne kadar dolar = 20
//dolkar / tl == 0.33
//print 20 * 0.33