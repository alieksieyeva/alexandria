package com.generation.alexandria.model.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Author
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name, surname;
	private LocalDate dob;
	private String imgUrl;
							//nome della proprietà in book dove è mappata la relazione
	@OneToMany (mappedBy = "author", fetch = FetchType.EAGER)//lato 1 della relazione autore-liber
	private List <Book> libriScritti;
}
