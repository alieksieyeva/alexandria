package com.generation.alexandria.model.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 	//aggiunge getter, setter, toString(), costruttore con parametri, equals(), hashCode()
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User 
{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username, password;
	private Integer level; //livello di accesso
	
	@OneToMany (mappedBy = "buyer", fetch = FetchType.EAGER)//lato 1 della relazione autore-liber
	private List <Order> orders;
}
