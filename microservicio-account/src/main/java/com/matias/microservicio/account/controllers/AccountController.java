package com.matias.microservicio.account.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.matias.microservicio.account.services.AccountService;

import io.reactivex.Single;

@RestController
@RequestMapping("/core")
public class AccountController {

	@Autowired
	private AccountService accountService;
		
	@GetMapping("/accounts")
	public Single<ResponseEntity<Object>> obtenerPersona(@RequestParam String cardNumber){	
		return accountService.findAccountByCard(cardNumber)
				.map(p -> ResponseEntity.status(HttpStatus.OK).body(p));
	}
}
