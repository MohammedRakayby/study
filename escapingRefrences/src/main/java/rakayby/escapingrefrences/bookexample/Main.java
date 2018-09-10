/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakayby.escapingrefrences.bookexample;

/**
 *
 * @author Mohammed Rakayby
 */
public class Main {
    public static void main(String [] args){
        BookCollection bc=new BookCollection();
        
        //This will mutate the price of this book if used with old getPrice method
        //in class Price
        bc.printAllBooks();
        System.out.println(bc.findBookByName("Book #1").getPrice().convert("EUR"));
        bc.printAllBooks();
    }
}
