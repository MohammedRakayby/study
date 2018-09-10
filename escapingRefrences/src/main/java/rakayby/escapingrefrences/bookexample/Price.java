/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakayby.escapingrefrences.bookexample;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mohammed Rakayby
 */
public class Price {
    private Map<String,Double> rates;
    private Double value;
    
    public Price(Double value){
        this.value=value;
        rates=new HashMap<>();
        rates.put("USD",1d);
        rates.put("GBP",0.6);
        rates.put("EUR",0.8);
    }
    
    //TODO: mutating a value in get method
//    public Double convert(String toCurrency){
//        if(toCurrency.equals("USD")){
//            return value;
//        }else{
//            Double conversion=rates.get("USD")/rates.get(toCurrency);
//            value=conversion*value;
//            return value;
//        }
//    }
    public Double convert(String toCurrency){
        if(toCurrency.equals("USD")){
            return value;
        }else{
            Double conversion=rates.get("USD")/rates.get(toCurrency);
            return conversion*value; 
        }
    }
    
    public String toString(){
        return this.value.toString();
    }
    
    //TODO: escaping refrence 
    //we could return immutable map, but instead will return the key only
    //since the key is double and its immutable
//    public Map<String,Double> getRates(){
//        return rates;
//    }
    
    public Double getRates(String currency){
        return rates.get(currency);
    }
}
