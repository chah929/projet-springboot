package com.example.projet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projet.modeles.Personne;

@RestController
public class PersonneController {
	
	@GetMapping("/")
	public String getinfo(){ 
		return "hello promise";
	}
	@GetMapping("/personnes")
   public Personne getPersonne() {
	   return new Personne("Chah","Promise","chahpromisengang@gmail.com",25);
   }
}
