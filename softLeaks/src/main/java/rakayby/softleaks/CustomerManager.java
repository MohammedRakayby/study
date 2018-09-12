/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakayby.softleaks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Mohammed Rakayby
 */
public class CustomerManager {
    private List<Customer> customers=new ArrayList();
    private int nextId=0;
    
    public void addCustomer(Customer customer){
        synchronized(this){
            customer.setId(nextId);
            nextId++;
        }
        customers.add(customer);
    }
    
    public Customer getNextCustomer(){
        //should do:
        //customers.remove(0)
        
        //this will cause memory leak, by setting heap size to 15mb and monitoring 
        //the app will crash as objects gets created and left with refrence in stack
        //thus accumlating in the heap,
        
//        return customers.get(0);
        Customer result=null;
        synchronized(this){
            if(customers.size()>0){
                result=customers.remove(0);
            }
        }
        return result;
        //by doing this synchronized block, object gets removed so their refrence is removed 
        //thus made available for garbage collection, by monitoring this vs the old code 
        //the heap graph is very different (efficient)
    }
    
    
    public void howManyCustomers(){
        int size=0;
        size=customers.size();
        System.out.println(new Date()+" : "+size);
    }
    
    public void displayCustomers(){
        synchronized(customers){
            for(Customer c : customers){
                System.out.println(c.toString());
                try{
                    Thread.sleep(500); 
                }catch(InterruptedException e ){
                    e.printStackTrace();
                }
            }
        }
    }
}
