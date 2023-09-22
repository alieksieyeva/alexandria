package com.generation.alexandria.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.alexandria.model.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>

{
	
	
}
