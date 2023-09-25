package com.generation.alexandria.model.entities;

import java.time.LocalDate;
import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity (name="userorder") //entity vuol dire che sarà salvato sul DB
public class Order 
{	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String items;
	//scegliamo la convenzione per salvare ordini di libri: id+quantità.
	//Idlibro1_-_Numero1;:;Idlibro2_-_Numero2;:;ecc
	
	
	private LocalDate orderDate, deliveryDate;
	
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name="userid")
	User buyer;
}
