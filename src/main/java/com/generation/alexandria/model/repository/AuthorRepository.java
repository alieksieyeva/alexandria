package com.generation.alexandria.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.alexandria.model.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>
{

}
