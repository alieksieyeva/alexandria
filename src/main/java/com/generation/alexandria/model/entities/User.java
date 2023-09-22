package com.generation.alexandria.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
}
