package com.generation.alexandria.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Prova 
{
	//mappatura jpa: quale proprietà corrisponde a quale riga in sql
	//prima -- annotazione @Entity -- vogliamo salvare oggetti di questa classe nel db
	// annotazione @Id -- dichiaro questa proprietà come chiave primaria
	//@Getter -- invece di source-> generate getters
	//@Setter --invece di source-> generate setters
	//getter e setter sono necessari per usare Springboot
	//=>ora sappiamo che nel db c'è una tabella Prova che ha id come colonna e che id è la chiave primaria
	
	@Id
	private String id;
	
}
