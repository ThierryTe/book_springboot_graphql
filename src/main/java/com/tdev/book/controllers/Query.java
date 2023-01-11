package com.tdev.book.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.tdev.book.models.Author;
import com.tdev.book.models.Tutorial;
import com.tdev.book.repositories.AuthorRepository;
import com.tdev.book.repositories.TutorialRepository;

@Component
public class Query implements GraphQLQueryResolver{
	 private AuthorRepository authorRepository;
	 private TutorialRepository tutorialRepository;
	  
	 @Autowired
	  public Query(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
	    this.authorRepository = authorRepository;
	    this.tutorialRepository = tutorialRepository;
	  }
	  
	  
	  public Iterable<Author> findAllAuthors() {
		    return authorRepository.findAll();
		  }

		  public Iterable<Tutorial> findAllTutorials() {
		    return tutorialRepository.findAll();
		  }

		  public long countAuthors() {
		    return authorRepository.count();
		  }

		  public long countTutorials() {
		    return tutorialRepository.count();
		  }
	  
}
