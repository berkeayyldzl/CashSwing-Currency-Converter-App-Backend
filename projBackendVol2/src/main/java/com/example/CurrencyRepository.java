package com.example;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

public interface CurrencyRepository extends MongoRepository<Currency, String> {
    // You can define additional query methods if needed
	
	
    double findByBaseCurrency(String mainCurrency);
    
   
   
    //Currency save(Currency currency);
    	
    	
    
    
    
   
    
    
    
}