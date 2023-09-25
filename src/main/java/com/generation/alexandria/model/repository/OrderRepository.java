package com.generation.alexandria.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.alexandria.model.entities.Order;
import com.generation.alexandria.model.entities.User;

public interface OrderRepository extends JpaRepository<Order, Integer>

{
	
	List <Order> findByBuyer(User u);
}
