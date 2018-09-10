/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakayby.escapingrefrences.bookexample;

/**
 *
 * @author Mohammed Rakayby
 * immutable objects like Strings, primitive data types or their wrappers cause no problem
 * so no need to worry about them
 */

//book is mutable since it contains a set method
public class Book implements BookReadOnly {
    private int id;
    private String title;
    private String author;
    private Price price;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    public Book(int id, String title, String author,Double Price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price=new Price(Price);
    }
    
    @Override
    public String toString(){
        return title+" by "+author;
    }
    
    @Override
    public Price getPrice(){
        return this.price;
    }
    public void setPrice(Double price){
        this.price=new Price(price);
    }
}
