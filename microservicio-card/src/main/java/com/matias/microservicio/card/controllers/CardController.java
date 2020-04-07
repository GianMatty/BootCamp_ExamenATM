package com.matias.microservicio.card.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.matias.microservicio.card.services.CardService;

import io.reactivex.Single;

@RestController
@RequestMapping("/core")
public class CardController {
	
	@Autowired
	private CardService cardService;
	
	@GetMapping("/cards")
	public Single<ResponseEntity<Object>> buscarCards(@RequestParam String documentNumber){
		return cardService.bucarCards(documentNumber)
				.map(p -> ResponseEntity.status(HttpStatus.OK).body(p)); 
	}
}
