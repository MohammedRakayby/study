/**
 * Nov 10, 2018
 * @author Mohammed Rakayby
 */
package com.rakayby.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rakayby.springwebapp.models.Book;

/**
 * Nov 10, 2018
 * @author Mohammed Rakayby
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
