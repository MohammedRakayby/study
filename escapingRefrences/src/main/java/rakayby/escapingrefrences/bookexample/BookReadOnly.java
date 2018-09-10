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
public interface BookReadOnly {

    String getAuthor();

    int getId();

    Price getPrice();

    String getTitle();

    String toString();
    
}
