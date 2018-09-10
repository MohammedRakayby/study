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
public class Customer implements CustomerReadOnly {
    private String name;

    public Customer(String name) {
        this.name = name;
    }
    public Customer(Customer anotherCustomer){
        this.name=anotherCustomer.name;
    }
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
}
