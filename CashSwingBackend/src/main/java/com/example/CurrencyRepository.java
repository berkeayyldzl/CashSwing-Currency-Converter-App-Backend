package com.example;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CurrencyRepository extends MongoRepository<Currency, String> { // The interface that extends MongoRepository for the user written functions.
    
    Currency findByMainCurrency(String mainCurrency); // For finding a Currency object by its name, mainCurrency parameter.
    List<Currency> findAll(); // For outputting all the objects in the Currency list.
   
}