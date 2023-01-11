package com.tdev.book.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tdev.book.models.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
