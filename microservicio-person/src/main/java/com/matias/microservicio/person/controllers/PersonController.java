package com.matias.microservicio.person.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.matias.microservicio.person.services.PersonService;

import io.reactivex.Single;


@RestController
@RequestMapping("/core")
public class PersonController {
	@Autowired
	private PersonService personService;
		
	@GetMapping("/persons")
	public Single<ResponseEntity<Object>> obtenerPersona(@RequestParam String documentNumber){	
		return personService.findPersonByDocument(documentNumber)
				.map(m -> ResponseEntity.status(HttpStatus.OK).body(m));
				
				
	}
	
}