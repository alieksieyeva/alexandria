package com.generation.alexandria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.generation.alexandria.model.entities.User;
import com.generation.alexandria.model.repository.AuthorRepository;
import com.generation.alexandria.model.repository.BookRepository;
import com.generation.alexandria.model.repository.UserRepository;

@Controller 
@SessionAttributes("user")
public class MainController
{
	@Autowired					//all'avvio del progetto saranno forniti 
	BookRepository bookRepo;	//3 bean, tre oggetti condivisi, che saranno collegati a queste variabili
	
	@Autowired
	AuthorRepository authorRepo;
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/")
	public String initialPage(Model model)
	{
		User currentUser =(User) model.getAttribute("user");		//tutti attributi in Model sono "Object";
		if(currentUser==null || currentUser.getUsername().equals("guest")) //se l'utente non ha ancora fatto login
		{
			currentUser=userRepo.findByUsername("guest");
			model.addAttribute("user", currentUser); //metto questo user come attributo di sessione 
											//(sarebbe stato attributo di request senza @SessionAttributes("user"))
			return "loginpage";
		}
		
		return "homepage";
	}
}
