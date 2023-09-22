package com.generation.alexandria.model.entities;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class Cart 
{
	private Map <Book,Integer> items = new HashMap<Book,Integer>();
	
	public void add(Book b, Integer n)
	{
		if(items.containsKey(b))			//controllo se il libro è già presente nel carello
			items.put(b, items.get(b)+n);  //se c'è, aggiungo 1 al numero complessivo di questo oggetto in carello
		else
			items.put(b, n);
	}
	
	public void remove(Book b, Integer n)
	{
		if(!items.containsKey(b))
			return;
		if(items.get(b)<=n)
			items.remove(b);
		else
			items.put(b, items.get(b)-n);
	}
	
	
	//mappa
	//chiave libro Divina commedia , id 7 -> valore 8
	//chiave libro Il fu mattia pascal, id 19 -> valore 2 
	//nel carrello abbiamo 8 divine commedie e due I.F.M.P
	
	//7_-_8;:;19_-_2;::
	//con il substring prendiamo tutta la stringa meno gli ultimi 3 caratteri
	//7_-_8;:;19_-_2
	
	
	public Order convertToOrder()
	{
		Order order = new Order();
		
		String itemsSerialiazed= "";
		for(Book b: items.keySet())
			itemsSerialiazed+=b.getId()+"_-_"+items.get(b)+";:;";
			
		itemsSerialiazed=itemsSerialiazed.substring(0, itemsSerialiazed.length()-3);
		
		order.setItems(itemsSerialiazed);
		order.setOrderDate(LocalDate.now());
		order.setDeliveryDate(LocalDate.now().plusDays(2));
		
		return order;
	}
	
	public int getCopies (Book b)
	{
		return items.get(b);
	}
	
	public double getTotalPrice(Book b)
	{
		return getCopies(b)*b.getPrice(); 
	}
	
	public double getTotalPrice()
	{
		double res=0;
		for(Book b: items.keySet())
			res+= getTotalPrice(b);
		
		return res;
	}
}
