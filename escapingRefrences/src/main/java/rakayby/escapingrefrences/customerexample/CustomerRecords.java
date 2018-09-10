/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakayby.escapingrefrences.customerexample;


import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javafx.print.Collation;

/**
 *
 * @author Mohammed Rakayby
 */
public class CustomerRecords implements Iterable<Customer>{
    private Map<String,Customer> records ;

    public CustomerRecords(Map<String, Customer> records) {
        this.records = records;
    }

    public CustomerRecords() {
        this.records=new HashMap<String,Customer>();
    }
    
    public void addCustomer(Customer a){
        this.records.put(a.getName(), a);
    }
    
    //can be modified, hence comprimising the private modifier
//    public Map<String,Customer>getCustomers(){
//        return new HashMap<String, Customer>(this.records);
//    }

    public Map<String,Customer>getCustomers(){
        return Collections.unmodifiableMap(this.records);
    }
    @Override
    public Iterator<Customer> iterator() {
        return records.values().iterator();
    }
    
    //not safe, this returns refrence to the customer
//    public Customer getCsutomerByName(String name){
//        return this.records.get(name);
//    }
//    
//    this will work but its not a full solution
//    @Override
//    public Customer getCsutomerByName(String name){
//        return new Customer(this.records.get(name));
//    }
    
//    this is a better solution, as there is not setname method in the interface 
      public CustomerReadOnly getCustomerByName(String name){
          return this.records.get(name);
      }
    
}
