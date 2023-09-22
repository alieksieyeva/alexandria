package com.generation.alexandria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.generation.alexandria.model.repository.ProvaRepository;


@Controller
public class ProvaController
{
	
	@Autowired //chiedo a spring di fornirmi l'oggetto di tipo ProvaRepository
	ProvaRepository repo;
	
	
	@GetMapping("/test")
	public String test(Model m)
	{
		m.addAttribute("test", repo.findAll());
		return "testpage";
	}
}
