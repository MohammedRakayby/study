/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakayby.escapingrefrences.bookexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohammed Rakayby
 */
public class BookCollection {
    private List<Book> books;

    public BookCollection() {
        books=new ArrayList<>();
        books.add(new Book(1,"Book #1","Book author 1",3.99));
        books.add(new Book(2,"Book #2","Book author 2",4.99));
        books.add(new Book(3,"Book #3","Book author 3",5.99));
        books.add(new Book(4,"Book #4","Book author 4",6.99));
        books.add(new Book(5,"Book #5","Book author 5",7.99));
        books.add(new Book(6,"Book #6","Book author 6",8.99));
        books.add(new Book(7,"Book #7","Book author 7",9.99));
        books.add(new Book(8,"Book #8","Book author 8",10.99));
        books.add(new Book(9,"Book #9","Book author 9",11.99));
        books.add(new Book(10,"Book #10","Book author 10",13.99));
        books.add(new Book(11,"Book #11","Book author 11",23.99));
    }
    
    //TODO: book is not immutable bec of setPrice() , so this is a problem
    //to fix, we will extract interface from book class with get methods only
    //and return it here 
//    public Book findBookByName(String title){
//        for (Book book:books){
//            if(book.getTitle().equals(title)){
//                return book;
//            }
//        }
//        return null;
//    }
    
    public BookReadOnly findBookByName(String title){
        for(BookReadOnly book:books){
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }
    
    public void printAllBooks(){
        for(Book book:books){
            System.out.println(book.getTitle()+": "+book.getPrice());
        }
    }
}
