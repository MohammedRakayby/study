/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakayby.softleaks;

/**
 *
 * @author Mohammed Rakayby
 */
public class Customer {
    private int id;
    private String name;
    
    public void setId(int id){
        this.id=id;
    }
    
    public String toString(){
        return id+ " : "+name;
    }
    
    public Customer(String name){
        this.name=name;
    }
}
