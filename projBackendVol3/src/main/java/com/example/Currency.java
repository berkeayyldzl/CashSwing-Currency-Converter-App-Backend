package com.example;

//Package com.example
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "exchange_rates")// Specify the MongoDB collection name
public class Currency {

 @Id
 private String id; // MongoDB ObjectId 01     does mongo db accept string;

 private String mainCurrency; //try/eur     
 private String currencyImage; //the name of the image
 private double exchangeRate; //0.032
 private double max;
 private double min;
 
 public Currency() {
     // Default constructor needed for Spring Data MongoDB
 }

 public Currency(String Currency, double exchangeRate,String currencyImage,double max, double min) {
     this.mainCurrency = Currency;
     this.exchangeRate = exchangeRate;
     this.currencyImage = currencyImage;
     this.max = max;
     this.min = min;
 }

 // Getters and setters

 public String getId() {
     return id;
 }
 
 public void setId(String id) {
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
 
 public String getcurrencyImage() {
     return currencyImage;
 }

 public void setCurrencyImage(String currencyImage) {
     this.currencyImage = currencyImage;
 }
 
 public double getmax() {
     return max;
 }

 public void setmax(double max) {
     this.max = max;
 }
 
 public double getmin() {
     return min;
 }

 public void setmin(double min) {
     this.min = min;
 }
  
}