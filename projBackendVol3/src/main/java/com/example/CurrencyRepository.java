package com.example;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CurrencyRepository extends MongoRepository<Currency, String> {
    // You can define additional query methods if needed
	
	
    Currency findByMainCurrency(String mainCurrency);
    List<Currency> findAll();
   
   
    //Currency save(Currency currency);
    	
    	
    
    
    
   
    
    
    
}