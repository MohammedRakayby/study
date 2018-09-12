/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakayby.softleaks;

import java.util.UUID;

/**
 *
 * @author Mohammed Rakayby
 */
public class GenerateCustomerTask implements Runnable{
    
    private CustomerManager cm;
    private int totalCustomersGenerated=0;
    
    public GenerateCustomerTask(CustomerManager cm){
        this.cm=cm;
    }
    
    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(1);
            }catch (InterruptedException e ){
                e.printStackTrace();
            }
            String name=new UUID(1l,10l).toString();
            Customer c =new Customer(name);
            cm.addCustomer(c);
            totalCustomersGenerated++;
            cm.getNextCustomer();
        } 
    }
    
}
