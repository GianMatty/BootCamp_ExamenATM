package com.matias.microservicio.reniec.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matias.microservicio.reniec.services.ReniecService;

import io.reactivex.Single;

@RestController
@RequestMapping("/external")
public class ReniecController {
	@Autowired
	private ReniecService reniecService;
	
	@PostMapping("/reniec/validate")
	public Single<Object> verificar(){
		return reniecService.validate()
				.map(s -> ResponseEntity.status(HttpStatus.OK).body(s));
	}
	
}
