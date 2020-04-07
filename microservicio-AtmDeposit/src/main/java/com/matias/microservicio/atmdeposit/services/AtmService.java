package com.matias.microservicio.atmdeposit.services;

import io.reactivex.Single;

public interface AtmService {

	public Single<Object> obtenerPersona(String documentNumber);
}
