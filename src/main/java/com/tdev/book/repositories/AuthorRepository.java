package com.tdev.book.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tdev.book.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{
	

}
