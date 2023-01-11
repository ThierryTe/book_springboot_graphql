package com.tdev.book.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.tdev.book.models.Author;
import com.tdev.book.models.Tutorial;
import com.tdev.book.repositories.AuthorRepository;

@Component
public class TutorialResolver implements GraphQLResolver<Tutorial>{
	
	  @Autowired
	  private AuthorRepository authorRepository;

	  public TutorialResolver(AuthorRepository authorRepository) {
	    this.authorRepository = authorRepository;
	  }

	  public Author getAuthor(Tutorial tutorial) {
	    return authorRepository.findById(tutorial.getAuthor().getId()).orElseThrow(null);
	  }

}
