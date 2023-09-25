package com.generation.alexandria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.generation.alexandria.model.entities.Book;
import com.generation.alexandria.model.entities.Cart;
import com.generation.alexandria.model.entities.User;
import com.generation.alexandria.model.repository.AuthorRepository;
import com.generation.alexandria.model.repository.BookRepository;
import com.generation.alexandria.model.repository.OrderRepository;
import com.generation.alexandria.model.repository.UserRepository;

@Controller 
@SessionAttributes({"user", "cart"})
public class MainController
{
	@Autowired					//all'avvio del progetto saranno forniti 
	BookRepository bookRepo;	//3 bean, tre oggetti condivisi, che saranno collegati a queste variabili
	
	@Autowired
	AuthorRepository authorRepo;
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	OrderRepository orderRepo;
	
	@GetMapping("/")
	public String initialPage(Model model)
	{
		User currentUser =(User) model.getAttribute("user");		//tutti attributi in Model sono "Object";
		if(currentUser==null || currentUser.getUsername()==null || currentUser.getUsername().equals("guest")) //se l'utente non ha ancora fatto login
		{
			currentUser=userRepo.findByUsername("guest");
			model.addAttribute("user", currentUser); //metto questo user come attributo di sessione 
											//(sarebbe stato attributo di request senza @SessionAttributes("user"))
			model.addAttribute("cart",new Cart());
			
			return "loginpage";
		}
		return "homepage";
	}
	
	@PostMapping ("/login")			//bindo la form alla variabile user di tipo User
	public String login(@ModelAttribute("tempusr") User user, Model model)
	{
		System.out.println(user);
		
		User  ondb = userRepo.findByUsername(user.getUsername());
		if(ondb==null || !ondb.getPassword().equals(user.getPassword())) //se non c'è utente con questo nome o la pass non corrisponde
		{
			model.addAttribute("errormessage", "Nome utente o password errati");
			return "loginpage";											//torniamo a loginpage
		}
		
		model.addAttribute("user", ondb);
		model.addAttribute("cart",new Cart());
		return "redirect:/";
		
	}
	
	@GetMapping("/guestlogin")
	public String guestlogin()
	{
		return "homepage";
	}
	
	@GetMapping("/registrationpage")
	public String registrationpage()
	{
		return "registration";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute("tempusr") User user, Model model)
	{
		User saved=null;
		try
		{
			user.setLevel(1);
			saved= userRepo.save(user); //il metodo save() restituisce ciò che ha salvato o una eccezione
		}
		catch(Exception e)
		{
			model.addAttribute("errormessage", "Nome utente già presente");
			return "registration";
		}
		
		model.addAttribute("user", saved);
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(Model model)
	{
		model.addAttribute("user", new User() ); //ripulire user
		return "redirect:/";
	}
	
	@GetMapping("/bookscatalogue")
	public String allbooks(Model model)
	{
		List <Book> all = bookRepo.findByOrderByTitleAsc();
		model.addAttribute("books", all);
		
		return "listbooks";
		
	}
	
	@GetMapping("/addToCart")
	public String addToCart(@RequestParam int id, @RequestParam int copies, Model model, @RequestParam(required=false) String src)
	{
		Book b = bookRepo.findById(id).get(); //questo metodo restituisce un oggetto di tipo Optional.
												//il mio libro è dentro Optional, optional.get() mi dà il libro 
		Cart c = (Cart) model.getAttribute("cart");
		if(copies>0)
			c.add(b, copies);
		else
			c.remove(b, copies*-1);
		
		model.addAttribute("cart",c);
		if(src !=null && src.equals("cartpage"))
			return "redirect:/cartpage";
		return "redirect:/bookscatalogue";
	}
	
	@GetMapping("/cartpage")
	public String goToCart()
	{
		return "cartpage";
	}
	
	@GetMapping("/bookdetail")
	public String bookDetail(@RequestParam Integer id, Model m)
	{									//findById(id) restituisce un Optional!!!
		m.addAttribute("book", bookRepo.findById(id).get());
		
		return "bookdetail";
	}
}

