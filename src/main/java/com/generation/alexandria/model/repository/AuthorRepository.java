package com.generation.alexandria.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.alexandria.model.entities.Author;
													//tipo dell'oggetto e il tipo della sua P.K.
public interface AuthorRepository extends JpaRepository<Author, Integer>
{

}
