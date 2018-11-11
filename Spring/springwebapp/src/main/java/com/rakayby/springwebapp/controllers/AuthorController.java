/**
 * Nov 11, 2018
 * @author Mohammed Rakayby
 */
package com.rakayby.springwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rakayby.springwebapp.repositories.AuthorRepository;

/**
 * Nov 11, 2018
 * @author Mohammed Rakayby
 *
 */
@Controller
public class AuthorController {
	private AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}
	
	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		model.addAttribute("authors",authorRepository.findAll());
		return "Authors";
	}
}
