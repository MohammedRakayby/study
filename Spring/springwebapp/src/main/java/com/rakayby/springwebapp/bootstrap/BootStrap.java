/**
 * Nov 10, 2018
 * @author Mohammed Rakayby
 */
package com.rakayby.springwebapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.rakayby.springwebapp.models.Author;
import com.rakayby.springwebapp.models.Book;
import com.rakayby.springwebapp.models.Publisher;
import com.rakayby.springwebapp.repositories.AuthorRepository;
import com.rakayby.springwebapp.repositories.BookRepository;
import com.rakayby.springwebapp.repositories.PublisherRepository;

/**
 * Nov 10, 2018
 * @author Mohammed Rakayby
 *
 */
@Component
public class BootStrap implements ApplicationListener<ContextRefreshedEvent>{

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
	
	
	public BootStrap(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
		
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository=publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		initData();
	}
	
	private void initData() {
		//populating DB
		Author jK=new Author("JK", "Rowling");
		Publisher elsherok=new Publisher("Elsherok", "hnak");
		Book hP=new Book("Harry Potter", "3333", elsherok);
		jK.getBooks().add(hP);
		hP.getAuthors().add(jK);
		hP.setPublisher(elsherok);
		
		authorRepository.save(jK);
		publisherRepository.save(elsherok);
		bookRepository.save(hP);
		
		Author hamam=new Author("hamam", "elshaalbaz");
		Publisher elAhram=new Publisher("El Ahram", "gnb el sherok");
		Book shalbazat=new Book("shaalbzat", "4321", elAhram);
		hamam.getBooks().add(shalbazat);
		shalbazat.getAuthors().add(hamam);
		shalbazat.setPublisher(elAhram);
		
		authorRepository.save(hamam);
		publisherRepository.save(elAhram);
		bookRepository.save(shalbazat);
		
	}

}
