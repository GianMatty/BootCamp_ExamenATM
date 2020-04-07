package com.matias.microservicio.atmdeposit.services;


import org.springframework.stereotype.Service;

import io.reactivex.Single;

@Service
public class AtmServiceImpl implements AtmService {

	private final String urlPerson = "http://localhost:8088/";
	
	//INSTANCIA DE RETROFIT
	UtilRetrofit retrofitPerson = new UtilRetrofit(urlPerson);
	//ENLAZO RETROFIT CON LA INTERFACE
	AtmServiceRetrofit connectPerson = retrofitPerson
			.getRetrofit()
			.create(AtmServiceRetrofit.class);
	
	@Override
	public Single<Object> obtenerPersona(String documentNumber) {
		return connectPerson.findPersonByDocumento(documentNumber);
	}
	
	

	
	
}
