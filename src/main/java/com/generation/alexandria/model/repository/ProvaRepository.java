package com.generation.alexandria.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.alexandria.model.entities.Prova;

public interface ProvaRepository extends JpaRepository<Prova, String>
{
		//JPA ha già una repository generica, per utilizzarla dobbiamo solo estenderla:
	//extends JpaRepository<Prova, String> 
						//Prova -->nome della entità, String il tipo della sua chiave primaria
	//in questo modo abbiamo già tutti i metodi di base: findAll(), findById(), ecc..
}
