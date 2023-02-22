package com.example.projet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonneController {
	
	@GetMapping("/")
	public String getinfo(){ 
		return "hello promise";
	}

}
