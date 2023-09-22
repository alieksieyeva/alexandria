package com.generation.alexandria.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.alexandria.model.entities.Book;

public interface BookRepository extends JpaRepository <Book, Integer>

{

}
