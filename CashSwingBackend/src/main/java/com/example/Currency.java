package com.example;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "exchange_rates")// The MongoDB collection name.
public class Currency {

 @Id
 private String id; // The id of the currency.
 private String mainCurrency; // The name of the currency.
 private String currencyImage; // The name of the image file.
 private double exchangeRate; // The numerical value of the exchange rate of the currency.
 private double max; // The maximum value of the currency in the 5 year period.
 private double min; // The minimum value of the currency in the 5 year period.
 
 public Currency() {
     // Default constructor for the Currency class.
 }

 public Currency(String Currency, double exchangeRate,String currencyImage,double max, double min) {
     this.mainCurrency = Currency;
     this.exchangeRate = exchangeRate;
     this.currencyImage = currencyImage;
     this.max = max;
     this.min = min;
     // Parameterized constructor for the Currency class.
 }

 // Getters and setters of the respecting fields of the Currency class.

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