package com.matias.microservicio.fingerprint.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matias.microservicio.fingerprint.services.FingerprintService;

import io.reactivex.Single;

@RestController
@RequestMapping("/core")
public class FingerprintController {
	
	@Autowired 
	private FingerprintService fingerprintService;
	
	@PostMapping("/fingerprint/validate")
	public Single<Object> verificar(){
		return fingerprintService.validate()
				.map(s -> ResponseEntity.status(HttpStatus.OK).body(s));
	}
}
