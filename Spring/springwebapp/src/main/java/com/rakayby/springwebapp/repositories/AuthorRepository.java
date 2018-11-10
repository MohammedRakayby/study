package com.rakayby.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rakayby.springwebapp.models.Author;

/**
 * Nov 10, 2018
 * @author Mohammed Rakayby
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Long>{
	
}
