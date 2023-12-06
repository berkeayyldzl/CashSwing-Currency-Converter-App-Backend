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
		private CurrencyRepository CurrencyRepository; // Assuming you have a CurrencyRepository

		// Method to update exchange rates for a specific base currency
		public void updateExchangeRates(String baseCurrency) {
			// Implement your logic to update exchange rates for the provided baseCurrency
			// This might involve fetching data from an external API and updating the repository
			// Example:
			// Call an external API to get updated rates
			// Update the currencyRepository with the new rates for the provided baseCurrency
			// currencyRepository.updateRatesForBaseCurrency(baseCurrency, newRates);
		}
    
		
		public void saveCurrency(Currency currency) {
			
			currencyRepository.save(currency);
	
		}
		
		public List<Currency> getAllCurrencies() {
	        return currencyRepository.findAll();
	    }
		
		@Autowired
	    private CurrencyRepository currencyRepository;

	    private List<Currency> currencyList = new ArrayList<>();

	    public CurrencyExchangeService() {
	        // Initialize the list when the service is created
	        initCurrencyList();
	    }

	    private void initCurrencyList() {
	        // Retrieve currencies from the repository and add them to the list
	        currencyList.addAll(currencyRepository.findAll());
	    }

	    public ExchangeRate getExchangeRates(String baseCurrency) {
	        Currency currency = findCurrencyByBaseAndTarget(baseCurrency, targetCurrency);
	        if (currency == null) {
	            // Handle scenario when rates are not found for the specified currencies
	            return null;
	        }
	        return new ExchangeRate(currency.getBaseCurrency(), currency.getTargetCurrency(), currency.getExchangeRate());
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