package com.example;

//Package com.example
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "currencies") // Specify the MongoDB collection name
public class Currency {

 @Id
 private static int id; // MongoDB ObjectId 01

 private static String mainCurrency; //try/eur
 
 private static double exchangeRate; //0.032

 public Currency() {
     // Default constructor needed for Spring Data MongoDB
 }

 public Currency(String Currency, double exchangeRate) {
     this.mainCurrency = Currency;
     this.exchangeRate = exchangeRate;
 }

 // Getters and setters

 public int getId() {
     return id;
 }
 
 public void setId(int id) {
     this.id = id;
 }

 public String getMainCurrency() {
     return mainCurrency;
 }

 public void setMainCurrency(String mainCurrency) {
     this.mainCurrency = mainCurrency;
 }

 public double getExchangeRate() {
     return exchangeRate;
 }

 public void setExchangeRate(double exchangeRate) {
     this.exchangeRate = exchangeRate;
 }
}