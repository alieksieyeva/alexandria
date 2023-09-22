package com.generation.alexandria.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.alexandria.model.entities.Book;

public interface BookRepository extends JpaRepository <Book, Integer>

{
	public List<Book> findByOrderByTitleAsc(); 
}
