package com.generation.alexandria.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book 
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String title, synopsis;
	private int numberOfPages;
	private double price;
	
	@ManyToOne(fetch = FetchType.EAGER) //quando leggi un libro dal db leggi in automatico sempre il suo padre
	@JoinColumn(name="authorid")	//nome colonna chiave esterna su mySQL
	private Author autore; 
	
}
