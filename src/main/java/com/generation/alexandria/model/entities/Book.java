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
public class Book implements Comparable <Book> 

							//Comparable è un'interfaccia standard di Java usata da tanyi classi per stabilire 
							//se 

{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String title, synopsis;
	private int numberOfPages;
	private double price;
	private String imgUrl;
	
	@ManyToOne(fetch = FetchType.EAGER) //quando leggi un libro dal db leggi in automatico sempre il suo padre
	@JoinColumn(name="authorid")	//nome colonna chiave esterna su mySQL
	private Author author;

	@Override
	public int compareTo(Book o) //può restituire un numero negativo se this è più piccolo di o ( di altro libro)
	{								//può restituire 0 se this è uguale a o (altro libro)
									//può restituire 1 se this è più grande o (altro libro)
									//il criterio di confronto (qua id) lo stabiliamo noi.
		if(this.id<o.id)
			return -1;
		if(this.id==o.id)
			return 0;
		return 1;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(!(o instanceof Book))
			return false;
		Book b= (Book) o;
		return this.id==b.id;
	}

	@Override
	public int hashCode()
	{
		return id;
	}
	
	
}
