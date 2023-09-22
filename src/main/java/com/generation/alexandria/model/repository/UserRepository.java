package com.generation.alexandria.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.alexandria.model.entities.User;

public interface UserRepository extends JpaRepository <User, Integer>
{
	//questa repository di default offre metodi CRUD di base
	
	//"SELECT * from user WHERE username= 'parametro'
	User findByUsername(String username); //questo metodo autogenera la query commentata sopra
		//convenzione per il nome metodo: find = leggi, by = secondo il paramatero, username = parametro
}
