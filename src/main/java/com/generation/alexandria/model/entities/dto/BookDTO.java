package com.generation.alexandria.model.entities.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDTO 
{
	private Integer id;
	private String title, synopsis;
	private int numberOfPages;
	private double price;
	private String imgUrl;
	private int authorid;
}
