package com.generation.alexandria.model.entities.dto;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.generation.alexandria.model.entities.Author;
import com.generation.alexandria.model.entities.Book;
import com.generation.alexandria.model.repository.AuthorRepository;

@Component
public class Mapper 
{	
	@Autowired
	AuthorRepository autRepo;
	
	public Book dtoToBook(BookDTO dto)
	{
		Book res = new Book();
		res.setId(dto.getId());
		res.setImgUrl(dto.getImgUrl());
		res.setNumberOfPages(dto.getNumberOfPages());
		res.setPrice(dto.getPrice());
		res.setTitle(dto.getTitle());
		res.setSynopsis(dto.getSynopsis());
		
		Optional<Author> a = autRepo.findById(dto.getAuthorid());
		
		if(a.isPresent())
			res.setAuthor(a.get());
		
		return res;
	}
	
}
