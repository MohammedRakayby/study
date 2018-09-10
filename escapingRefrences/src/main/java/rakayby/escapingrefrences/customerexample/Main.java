/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakayby.escapingrefrences.customerexample;

/**
 *
 * @author Mohammed Rakayby
 */
public class Main {
    public static void main(String[] args){
        CustomerRecords cr = new CustomerRecords();
        cr.addCustomer(new Customer("Hoppa"));
        cr.addCustomer(new Customer("Hoppa tany"));
        
        cr.getCustomers().clear(); 
        for(Customer x:cr){
            System.out.println(x.getName());
        }
    }
}
